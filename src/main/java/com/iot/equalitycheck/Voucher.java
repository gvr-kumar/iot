package com.iot.equalitycheck;

public class Voucher extends Money{
	
	String voucherStore;
	
	public Voucher(String voucherStore, float amount, String currency)
	{
		super(amount, currency);
		this.voucherStore = voucherStore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((voucherStore == null) ? 0 : voucherStore.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		if (voucherStore == null) {
			if (other.voucherStore != null)
				return false;
		} else if (!voucherStore.equals(other.voucherStore))
			return false;
		return true;
	}

	
	
	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * // if (!(obj instanceof Voucher)) return false;
	 * 
	 * Voucher vch = (Voucher)obj;
	 * 
	 * if(this.voucherStore.equals(vch.voucherStore)&& this.amount==vch.amount &&
	 * this.currency.equals(vch.currency)) return true;
	 * 
	 * return false; }
	 */
	
}
