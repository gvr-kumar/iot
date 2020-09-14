package com.iot.access;

public class PublicMembers {
	
	int pblcMember1;
	int pblcMember2;
	
	PublicMembers() {
		// TODO Auto-generated constructor stub
		System.out.println("PublicMembers Instance (object) created with default values.");		
	}
	
	private PublicMembers(int pm1, int pm2) {
		// TODO Auto-generated constructor stub
		pblcMember1 = pm1;
		pblcMember2 = pm2;
		System.out.println("PublicMembers Instance (object) created with arguments.");
	}
	
	public int pblcMethod1() {
		
		return pblcMember1 + pblcMember2;
	}
	
	public static PublicMembers createInstance()
	{
		 PublicMembers pblcMem = new PublicMembers(10,20);
		 return pblcMem;
	}

}


//why createInstance should be static

//how do we know the number of instances created for public members class
