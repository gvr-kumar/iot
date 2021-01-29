package com.iot.equalitycheck;

public class Voucher extends Money{
	
	String voucherStore;
	
	public Voucher(String voucherStore, float amount, String currency)
	{
		super(amount, currency);
		this.voucherStore = voucherStore;
	}

	@Override
	public boolean equals(Object obj) {
		
		//
		if (!(obj instanceof Voucher))
            return false;
		
		Voucher vch = (Voucher)obj;
		
		if(this.voucherStore.equals(vch.voucherStore)&& this.amount==vch.amount && this.currency.equals(vch.currency))
			return true;
		
		return false;
	}
	
}
