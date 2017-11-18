package com.gj2;

public class MyEvent {
	// Variablen der Klasse
	public String name,description = "";
	public int ap,dynamite,beer,money,follower,zeal,progress = 0;
	
	//Konstruktor Events
	public MyEvent(String name, String description, 
					int ap, int dynamite, int beer, int money, int follower,  
					int zeal, int progress)
	{
	
		//Event
		this.name = name;
		this.description = description;
		
		//Player
		this.ap = ap;
		this.dynamite = dynamite;
		this.beer = beer;
		this.money = money;
		this.follower = follower;
		
		
		//Temple
		this.zeal = zeal;
		this.progress = progress;
	}
	
	
}

