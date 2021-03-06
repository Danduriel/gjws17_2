package com.gj2;


import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	public Player player = new Player("Bob","male","monkey");
	public Temple temple = new Temple(100.0,100.0,0.0);
	
	public int turn;
	public EventCreator eventCreator = new EventCreator();
	public ActionCreator actionCreator = new ActionCreator();
	
	public MyEvent tempEvent = new MyEvent("","",0,0,0,0,0,0,0);
	public MyAction tempAP = new MyAction("","",0,0,0,0,0,0,0);
	
	
	public Gamesim(int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//Sieg, Loss Abfrage
		if (temple.progress >= temple.maxProgress) {
			//Loss Funktion
		}
		else if (temple.zeal <= 0) {
			//Win Funktion
		}
		
		//erzeugt ein zufälliges Event
		getRandomEvent();
		
		
		// SHOW DIALOG
		
		
		//AP Player / Temple update 
		player.update(tempAP.ap,tempAP.dynamite, tempAP.beer, tempAP.money, tempAP.follower);
		temple.update(tempAP.zeal, tempAP.progress);
		
		//Event Player / Temple update
		player.update(tempEvent.ap,tempEvent.dynamite, tempEvent.beer, tempEvent.money,tempEvent.follower);
		temple.update(tempEvent.zeal, tempEvent.progress);
		
		temple.update(1.0, temple.zeal/10.0);
		
		
		// Make sure there are no Values below 0 
		
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

