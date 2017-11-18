package com.gj2;

import java.util.ArrayList;

public class ItemList {
	static ArrayList <Item> itemList = new ArrayList<Item>();
	
	public ItemList(){
		//BananaBomb
		itemList.add(new Item("BananaBomb",	//Name
							"Wenn eine Banane nicht genug ist", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
	}
}
