package com.gj2;


import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	public Player player = new Player("Bob","male","monkey");
	public Temple temple = new Temple(400,5000,0);
	
	public int turn;
	public EventCreator eventCreator = new EventCreator();
	public MyEvent tempEvent = new MyEvent("","",0,0,0,0,0,0,0);
	//public String description = "";
	public MyAction tempAP = new MyAction("","",0,0,0,0,0,0,0);
	
	
	public Gamesim(int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//erzeugt ein zufälliges Event
		getRandomEvent();
		
		
		//description = tempEvent.description;
		
		
		//AP Player / Temple update 
		player.update(tempAP.dynamite, tempAP.beer, tempAP.money, tempAP.follower, tempAP.ap);
		temple.update(tempAP.zeal, tempAP.progress);
		
		//Event Player / Temple update
		player.update(tempEvent.ap,tempEvent.dynamite, tempEvent.beer, tempEvent.money,tempEvent.follower);
		temple.update(tempEvent.zeal, tempEvent.progress);
		
		//Debug Code
		System.out.println("Update");
		System.out.println("Runde: " + turn);
		//System.out.println(description);
		System.out.print("AP: "+player.ap+"\nDynamite: "+player.dynamite+ "\nBeer: "+player.beer+ "\nMoney: "+player.money+ "\nFollower: "+ player.follower);
		System.out.print("Zeal: "+temple.zeal+"\nProgress: "+temple.progress);
		turn++;
	}
	
	public void getRandomEvent() {
		tempEvent = EventCreator.getEventValue(ThreadLocalRandom.current().nextInt(0,3));
	}	
	
	public void setNextAction(String action) {
		//ToDo Switch action
		if (action == "beer") {
			//tempAP=Action.clickBeerButton();
		}
		else if (action == "dynamite") {
			//tempAP=APCreator.clickDynamiteButton();
		}
	}
}

