package com.gj2;

package com.badogic.drop;

import java.util.concurrent.ThreadLocalRandom;

public class Gamesim {
	public Player player = new Player("Bob","male","monkey");
	public Temple temple = new Temple(400,5000,0);
	public int turn;
	public EventCreator eventCreator = new EventCreator();
	public MyEvent tempEvent = new MyEvent("","",0,0,0,0,0,0,0);
	public String description = "";
	public MyAP tempAP = new MyAP("","",0,0,0,0,0,0,0);
	
	
	public Gamesim(int turn) {	
		this.turn = turn;
	}
	
	public void update() {
		//Fuehrt neues Random Event aus
		
		//getNextAction("derp"); //FIX
		getRandomEvent();
		
		//Addiert Event Werte
		description = tempEvent.description;
		
		
		//AP Player / Temple update 
		player.update(tempAP.dynamite, tempAP.beer, tempAP.money, tempAP.might, tempAP.ap);
		temple.update(tempAP.zeal, tempAP.progress);
		
		//Event Player / Temple update
		player.update(tempEvent.dynamite, tempEvent.beer, tempEvent.money,tempEvent.might, tempEvent.ap);
		temple.update(tempEvent.zeal, tempEvent.progress);
		
		//Debug Code
		System.out.println("Update");
		System.out.println("Runde: " + turn);
		System.out.println(description);
		System.out.print("Dynamite: "+player.dynamite+ "\nBeer: "+player.beer+ "\nMoney: "+player.money+ "\nMight+ "+ player.might+"\nAP: "+player.ap+"\n");
		System.out.print("Zeal: "+temple.zeal+"\nProgress: "+temple.progress);
		turn++;
	}
	
	public void getRandomEvent() {
		tempEvent = EventCreator.getEventValue(ThreadLocalRandom.current().nextInt(0,3));
	}	
	
	public void setNextAction(String action) {
		//ToDo Switch action
		if (action == "beer") {
			tempAP=APCreator.clickBeerButton();
		}
		else if (action == "dynamite") {
			tempAP=APCreator.clickDynamiteButton();
		}
	}
}

