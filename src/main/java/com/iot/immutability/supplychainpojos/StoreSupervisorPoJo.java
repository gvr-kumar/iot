package com.iot.immutability.supplychainpojos;

public final class StoreSupervisorPoJo {
	
	private String storSupName;
	private String storSupGender;
	private String storSupQual;
	//private String storSupAddrs;
	
	public StoreSupervisorPoJo(String supName, String supGender, String supQual, String supStorAddrs) {
		super();
		this.storSupName = supName;
		this.storSupGender = supGender;
		this.storSupQual = supQual;
		//this.storSupAddrs = supStorAddrs;
	}

	public String getSupName() {
		return storSupName;
	}

	public void setSupName(String supName) {
		this.storSupName = supName;
	}

	public String getSupGender() {
		return storSupGender;
	}

	public void setSupGender(String supGender) {
		this.storSupGender = supGender;
	}

	public String getSupQual() {
		return storSupQual;
	}

	public void setSupQual(String supQual) {
		this.storSupQual = supQual;
	}

	/*
	 * public String getSupStorAddrs() { return storSupAddrs; }
	 * 
	 * public void setSupStorAddrs(String supStorAddrs) { this.storSupAddrs =
	 * supStorAddrs; }
	 */
	
	

}
