package com.iot.access;

public class ProtectedMembers {
	
	protected int prtcMember1  = 10;
	protected int prtcMember2  = 20;
		
	protected int prtcMethod1() {
		
		return prtcMember1 + prtcMember2;
	}

}
