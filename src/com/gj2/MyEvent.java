package com.gj2;

public class MyEvent {
	// Variablen der Klasse
	public String name,description = "";
	public int dynamite,beer,zeal,money,progress,might,ap = 0;
	
	//Konstruktor Events
	public MyEvent(String startName, String startDescripton, 
					int dynamite, int beer, int money, int might, int ap, 
					int startZeal, int startProgress)
	{

		
		//Event
		this.name = startName;
		this.description = startDescripton;
		
		//Player
		this.dynamite = dynamite;
		this.beer = beer;
		this.money = money;
		this.might = might;
		this.ap = ap;
		
		//Temple
		this.zeal = startZeal;
		this.progress = startProgress;
	}
	
	
}

