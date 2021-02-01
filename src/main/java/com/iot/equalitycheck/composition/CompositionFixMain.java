package com.iot.equalitycheck.composition;

public class CompositionFixMain {
	public static void main(String[] args) {
	
	MoneyC m = new MoneyC(500.50f, "Rupees");
	VoucherC v = new VoucherC("Hyderabad", 500.50f, "Rupees");
	
	if(m.equals(v))
	{
		System.out.println("m is equal to v");
	}
	else
	{
		System.out.println("m is NOT equal to v");
	}
	
	if(v.equals(m))
	{
		System.out.println("v is equal to m");
	}
	else
	{
		System.out.println("v is NOT equal to m");
	}
	}

}
