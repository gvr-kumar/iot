package com.iot.immutability.supplychainpojos;

public class Store {

	//SKU, items list, add item, remove item
	
	private String itemSku;
	private String itemName;
	private String itemPrice;
	
	public Store(String itemSku, String itemName, String itemPrice) {
		super();
		this.itemSku = itemSku;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
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
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	@Override
	public String toString() {
		return this.itemSku + " - " + this.itemName + " - " + this.itemPrice;
	}
	
	
}
