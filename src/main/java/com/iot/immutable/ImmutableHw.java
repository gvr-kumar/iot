package com.iot.immutable;

public final class ImmutableHw {
	
	private final String name;
	private final int ID;
	
	private final ValuPOJO valPojo;
	
	public ImmutableHw(String name, int ID, ValuPOJO valPojo) {
		this.name = name;
		this.ID = ID;
		this.valPojo = valPojo;
	}
	
	
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}

	public ValuPOJO getValPojo() {
		return valPojo;
	}
	
	
}