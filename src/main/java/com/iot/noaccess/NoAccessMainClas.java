package com.iot.noaccess;
import com.iot.access.ProtectedMembers;
import com.iot.oops.Human;

public class NoAccessMainClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedMembers prtcMem = new ProtectedMembers();
		
		//prtcMem. --> cant access protected members which are in a different package.
		
		Human hum = new Human();
		//hum.Sal

	}

}
