package com.gj2;

public class Item {
	public String name,description,file = "";
	public int ap,dynamite,beer,money,follower,zeal,progress = 0;
	
	//Konstruktor Events
	public Item(String name, String description, String file, 
					int ap, int dynamite, int beer, int money, int follower,  
					int zeal, int progress)
	{
		//Event
		this.name = name;
		this.description = description;
		this.file = file;
		
		//Player
		this.dynamite = dynamite;
		this.beer = beer;
		this.money = money;
		this.follower = follower;
		this.ap = ap;
		
		//Temple
		this.zeal = zeal;
		this.progress = progress;
	}
}
