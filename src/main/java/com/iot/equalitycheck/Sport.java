package com.iot.equalitycheck;

public class Sport {
	
	String sportName;
	
	int noOfPlyrs;

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public int getNoOfPlyrs() {
		return noOfPlyrs;
	}

	public void setNoOfPlyrs(int noOfPlyrs) {
		this.noOfPlyrs = noOfPlyrs;
	}
	
	public Sport(String sportName, int noOfPlyrs)
	{
		this.sportName = sportName;
		this.noOfPlyrs = noOfPlyrs;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//we need to typecast obj to Sport type as obj is of Object type
		Sport sprt1 = (Sport)obj;
		System.out.println("Equals override method");
		//if()
		//{
			
		//}
		return (sprt1.getSportName().equals(this.sportName));
	}

}
