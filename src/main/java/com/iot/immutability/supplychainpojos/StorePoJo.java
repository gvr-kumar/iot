package com.iot.immutability.supplychainpojos;

public class StorePoJo {

	//SKU, items list
	
	private String itemSku;
	private String itemName;
	private float itemPrice;
	private int itemQty;
	
	public StorePoJo(String itemSku, String itemName, float itemPrice, int itemQty) {
		super();
		this.itemSku = itemSku;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQty = itemQty;
	}
	public String getItemSku() {
		return itemSku;
	}
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	
	@Override
	public String toString() {
		return this.itemSku + " - " + this.itemName + " - " + this.itemPrice + " - " + this.itemQty;
	}
}
