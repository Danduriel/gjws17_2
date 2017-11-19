package com.gj2;

import java.util.ArrayList;

public class Inventory {
	static ArrayList <Item> inventoryList = new ArrayList<Item>();
	
	public void addItem(String name) {
		inventoryList.add(ItemList.getItem(name));
	}
	
	public void removeItem(String name) {
		for (int i = 0; i < inventoryList.size(); i++) {
			if (inventoryList.get(i).name == name) {
				inventoryList.remove(i);
			}
		}
	}
}
