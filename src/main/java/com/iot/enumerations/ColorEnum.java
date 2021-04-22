package com.iot.enumerations;

public enum ColorEnum {
	
	RED("STOP"),
	GREEN("GO"),
	ORANGE("SLOW");
	
	String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Constructor in enum should always be private or protected 
	 */
	
	private ColorEnum(String action)
	{
		this.action = action;
		//System.out.println(action);
	}

}
