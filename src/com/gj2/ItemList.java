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
							"So s��e, kleine Kaninchen. Was k�nnen die schon anrichten?.", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress
				
		//Schnaps
		itemList.add(new Item("Schnaps",	//Name
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
							"Ein Baggersee ist eh viel sch�ner, als so ein Tempel, oder?", //Description
							"", //Filename
							0,0,0,0,0,0,0)); // AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress			
	}
	
	public Item getItem(String name) {
		for (int i = 0; i < this.itemList.size(); i++) {
			if (this.itemList.get(i).name == name) {
				return this.itemList.get(i);
			}
		}
		
		return itemList.get(0);
	}
}
