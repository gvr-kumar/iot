package com.iot.singleton;

public class SwaneeCustomer {
	
	private String customerAccNo;
	private String customerName;
	private String customerAddress;
	
	
	public SwaneeCustomer(String customerAccNo, String customerName, String customerAddress) {
		super();
		this.customerAccNo = customerAccNo;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public String getCustomerAccNo() {
		return customerAccNo;
	}
	public void setCustomerAccNo(String customerAccNo) {
		this.customerAccNo = customerAccNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
