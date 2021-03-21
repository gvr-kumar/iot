package com.iot.immutability.supplychainservice;

import com.iot.immutability.supplychainpojos.StorePoJo;

public class SupplyChainMain {
	
	public static void main(String[] args) {
		
		StorePoJo kellogschoco = new StorePoJo("k001", "ChocoPuffs", 2.5f , 5);
		StorePoJo kellogspuffs = new StorePoJo("k001", "ChocoPuffs", 2.5f , 6);
		
		StoreService.addItem(kellogschoco);
		StoreService.addItem(kellogspuffs);
  
  }

}
