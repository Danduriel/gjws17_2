package com.gj2;


public class MyAction {
	// Variablen der Klasse
	public String name,description = "";
	public int ap,dynamite,beer,money,follower = 0;
	public double zeal, progress = 0.0;
	
	//Konstruktor Events
	public MyAction(String name, String description, 
					int ap, int dynamite, int beer, int money, int follower,  
					double zeal, double progress)
	{
		//Event
		this.name = name;
		this.description = description;
		
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
