package com.iot.comparison;

import java.util.ArrayList;
import java.util.List;

public class GiftBasket implements Comparable<GiftBasket>{
	
	
	String basketName;
	int qty;	
	float price;
	
	List<String> basketList = new ArrayList<String>();
		
	public List<String> getBasketList() {
		return basketList;
	}

	public void setBasketList(List<String> basketList) {
		this.basketList = basketList;
	}

	public String getBasketName() {
		return basketName;
	}

	public void setBasketName(String basketName) {
		this.basketName = basketName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
public GiftBasket(String basketName, int qty, float price) {
		super();
		this.basketName = basketName;
		this.qty = qty;
		this.price = price;
	}

public int compareTo(GiftBasket o) {
		
		return this.basketName.compareTo(o.basketName);
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.basketName;
}
	
}
