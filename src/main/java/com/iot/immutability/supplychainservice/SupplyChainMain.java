package com.iot.immutability.supplychainservice;

import com.iot.immutability.supplychainpojos.StorePoJo;

public class SupplyChainMain {
	
	public static void main(String[] args) {
		
		StorePoJo kellogs1 = new StorePoJo("k001", "ChocoPuffs", 2.5f , 5);
		StorePoJo kellogs2 = new StorePoJo("k001", "ChocoPuffs", 2.5f , 5);
	}

}
