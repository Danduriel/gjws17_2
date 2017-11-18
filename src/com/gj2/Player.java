package com.gj2;



public class Player {
	
	public String name; 
	public String gender; 
	public String race;
	
	double damage; // Schaden an Temple
	public double dynamiteEfficiency;
	public int follower;
	public int ap;
	
	public int dynamite;
	public int beer;
	public int money; 
	

	
	public Player(String name, String gender, String race) {
		
		this.name = name;
		this.gender = gender;
		this.race = race;
		
		this.damage = 1.0;
		this.dynamiteEfficiency = 1.0;
		this.ap = 10;
		
		this.dynamite = 0;
		this.beer = 0;
		this.money = 100;
		this.follower = 0;
		
	}
			
	public void update(int dynamite, int beer, int money, int damage,int ap) {
		this.dynamite += dynamite;
		this.dynamiteEfficiency = 1.0;
		this.beer += beer;
		this.money += money;
		this.damage += damage + this.follower * 0.5;
		this.ap += ap;
	}



}

