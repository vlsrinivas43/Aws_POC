package com.comcast.keb.logicalaccess.business.model;

public class BusinessRequest {

	private String httpMethod;
	
	private int businessid;

	private Business business;
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public int getBusinessid() {
		return businessid;
	}

	public void setBusinessid(int businessid) {
		this.businessid = businessid;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
	
	
}
