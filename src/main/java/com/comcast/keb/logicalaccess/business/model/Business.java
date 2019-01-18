package com.comcast.keb.logicalaccess.business.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "BusinessMaster")
public class Business {

	@DynamoDBHashKey
	private int businessid;
	
	@DynamoDBAttribute
	private String businessName;
	
	public Business() {}

	public Business(int businessid, String businessName) {
		super();
		this.businessid = businessid;
		this.businessName = businessName;
	}

	public int getBusinessid() {
		return businessid;
	}

	public void setBusinessid(int businessid) {
		this.businessid = businessid;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	
}
