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
		
		//falscher Bart
		itemList.add(new Item("falscher Bart",	//Name
							"Falls man mal unerkant die Baustelle betreten 'muss'.", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
		
		//Kaninchen
		itemList.add(new Item("Kaninchen",	//Name
							"So süße, kleine Kaninchen. Was können die schon anrichten?.", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
				
		//Schnaps
		itemList.add(new Item("Rum",	//Name
							"Wenn selbst das Banana Beer nicht mehr ausreicht.", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
		
		//Kacke
		itemList.add(new Item("Kacke",	//Name
							"Kacke.", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
		
		//Kacke
		itemList.add(new Item("Bagger",	//Name
							"Ein Baggersee ist eh viel schöner, als so ein Tempel, oder?", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress			
	}
	
	public static Item getItem(String name) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).name == name) {
				return itemList.get(i);
			}
		}
		
		return itemList.get(0);
	}
}
