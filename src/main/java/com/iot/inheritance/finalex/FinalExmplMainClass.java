package com.iot.inheritance.finalex;

public class FinalExmplMainClass {

	public static void main(String[] args) {
		
		FinalMethodSuperClass finSupCls = new FinalMethodSuperClass();
		
		FinalMethodChildClass finChldCls = new FinalMethodChildClass(); 
		
		finChldCls.finlMethod();
	}

}
