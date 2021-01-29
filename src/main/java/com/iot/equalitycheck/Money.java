package com.iot.equalitycheck;

public class Money {
	
	float amount;
	String currency;

	public Money(float amount, String currency)
	{
		this.amount = amount;
		this.currency = currency;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Money))
            return false;
		
		Money m = (Money)obj;
		
		if(this.amount==m.amount && this.currency.equals(m.currency))
			return true;
		
		return false;
	}
}
