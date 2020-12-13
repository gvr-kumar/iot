package com.iot.utils;

public class HelperTestClass {
	int a;
	String s1;
	String s2;
	String s3;
	
	/*
	 * Helper class is which has reusable code or an utility class
	 *
	 *here StringUtil is a helper class
	 */
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS1() {
		return StringUtil.getValidString(s1);		
		
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return StringUtil.getValidString(s2);
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getS3() {
		return StringUtil.getValidString(s3);
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	
	public static void main(String[] args) {
		
		//For Strings and any other Objects if there is no reference assigned to an instance or object then reference is pointing to null
		
		//for primitive types if variables are not initialized then their default value is 0
		
		HelperTestClass helpTstCls = new HelperTestClass();

		if(helpTstCls.getA()==0)
		{
			System.out.println("a is 0");
			System.out.println();
		}
		
		if(helpTstCls.getS1()==null)
		{
			System.out.println("s1 reference is null");
			System.out.println();
		}
		
		if(helpTstCls.getS1().equals(null))
		{
			System.out.println("s1 is null");
		}
		
		
	}
}
	
	
