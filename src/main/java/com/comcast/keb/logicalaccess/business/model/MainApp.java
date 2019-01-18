package com.comcast.keb.logicalaccess.business.model;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;

public class MainApp {

	public static Object handleRequest(BusinessRequest businessRequest, Context context) throws ResourceNotFoundException{
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		Business business = null;
		
		switch (businessRequest.getHttpMethod()) {
		case "GET":
			business = mapper.load(Business.class, businessRequest.getBusinessid());
			if(business == null) {
				throw new ResourceNotFoundException("Resource Not Found: " + businessRequest.getBusinessid());
			}
			return business;

		case "POST":
			business = businessRequest.getBusiness();
			mapper.save(business);
			return business;
		default:
			break;
		}
		return null;
	}
}
