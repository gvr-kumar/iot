package com.iot.access;

public class AccessModel {

	/*
	 * able to access  protected members since ProtectedMembers its in the same package
	 * 
	 * {@link com.iot.access.ProtectedMembers#prtcMethod1}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicMembers pblMem1 = new PublicMembers();		
		
		PublicMembers.createInstance();
		
		PrivateMembers prvtMem = new PrivateMembers();
		ProtectedMembers prtcMem = new ProtectedMembers();
		
		pblMem1.pblcMethod1();
		
		//prvtMem. --> cant access private method which is in a different class even though in same package.
		
		prtcMem.prtcMethod1(); 
		
	}

}
