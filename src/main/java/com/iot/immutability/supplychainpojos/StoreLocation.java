package com.iot.immutability.supplychainpojos;

public final class StoreLocation {
	
	private final String storId;
	private final String addressLine1;
	private final String addressLine2;
	private final String city;
	private final String zipCode;
	
	public StoreLocation(String storId, String addressLine1, String addressLine2, String city, String zipCode) {
		super();
		this.storId = storId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStorName() {
		return storId;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getCity() {
		return city;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	@Override
	public String toString() {
		return this.storId + " - " + this.addressLine1 + " - " + this.addressLine2 + " - " + this.city + " - " + this.zipCode;
	}
	
	

}
