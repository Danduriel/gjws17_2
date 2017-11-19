package com.gj2;



public class Player {
	
	public String name; 
	public String gender; 
	public String race;
	
	
	public int ap;
	public int dynamite;
	public int beer;
	public int money; 
	public int follower;

	
	public Player(String name, String gender, String race) {
		
		this.name = name;
		this.gender = gender;
		this.race = race;
		
		this.ap = 10;
		this.dynamite = 0;
		this.beer = 0;
		this.money = 100;
		this.follower = 0;
	}
			
	public void update(int ap ,int dynamite, int beer, int money, int follower) {
		this.ap += ap;
		this.dynamite += dynamite;
		this.beer += beer;
		this.money += money;
		this.follower += follower;
		
		/*
		if(this.ap < 0)
			this.ap = 0;
		if(this.dynamite < 0)
			this.dynamite = 0;
		if(this.beer < 0)
			this.beer = 0;
		if(this.money < 0)
			this.money = 0;
		if(this.follower < 0)
			this.follower = 0;
		*/
			
	}
}

