package com.iot.equalitycheck.composition;

public class VoucherC extends MoneyC{
	
	String voucherStore;
	
	
	public VoucherC(String voucherStore, float amount, String currency)
	{
		super(amount, currency);
		this.voucherStore = voucherStore;
		
	}
	

	@Override
	public boolean equals(Object obj) {
		
		//
		System.out.println(this.getClass());
		System.out.println(obj.getClass());
		System.out.println(getClass());
		
		if (!(obj.getClass() == getClass()))
            return false;
		
		VoucherC vch = (VoucherC)obj;
		
		if(this.voucherStore.equals(vch.voucherStore)&& this.amount==(vch.amount) && this.currency.equals(vch.currency))
			return true;
		
		return false;
	}
	
}
