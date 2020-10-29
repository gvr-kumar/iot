package com.iot.wrapperclassautoboxingunboxing;

//Creating a custom Wrapper class 

public class ScientificCalculator{
	
	private int a;
	private int b;
	private int c;
	
	private Calculator calc = new Calculator();
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	public int absValue(int a)
	{
		if(a<0)
		{
			a = -a;
		}
		return a;
	}
	public int exponent(int a, int b)
	{
		int d = 1;
		for(int i=1;i<=b;i++)
		{
			d = calc.multiply(a, d);
		}
		return d;
	}

}
