package com.iot.cloning;

public class Address implements Cloneable {
	
	private String address1 = "";
	private String address2 = "";
	private String city = "";
	
	
	public Address(String address1, String address2, String city) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
	}	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	

public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	
	@Override
	protected Address clone() throws CloneNotSupportedException {

		return (Address) super.clone();
	}

	@Override
	public String toString() {
		return this.address1 + ", " + this.address2 + ", " + this.city;
	}

}
