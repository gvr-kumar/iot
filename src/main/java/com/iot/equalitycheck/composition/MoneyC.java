package com.iot.equalitycheck.composition;

public class MoneyC {
	
	float amount;
	String currency;

	public MoneyC(float amount, String currency)
	{
		this.amount = amount;
		this.currency = currency;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println(this.getClass());
		System.out.println(obj.getClass());
		System.out.println(getClass());
		
		if (!(obj.getClass() ==  getClass()))
            return false;
		
		MoneyC m = (MoneyC)obj;
		
		if(this.amount==m.amount && this.currency.equals(m.currency))
			return true;
		
		return false;
	}
}
