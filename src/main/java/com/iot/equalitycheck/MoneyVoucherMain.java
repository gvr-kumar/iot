package com.iot.equalitycheck;

public class MoneyVoucherMain {

	public static void main(String[] args) {
		Money m = new Money(500.50f, "Rupees");
		Voucher v = new Voucher("Hyderabad", 500.50f, "Rupees");
		
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
