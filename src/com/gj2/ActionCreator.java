package com.gj2;

public class ActionCreator {
	public ActionCreator() {
		//MyAP myAP = new MyAP("","",0,0,0,0,0,0,0);
	}
	
	//Dummy ButtonFunktion
	// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
	public static MyAction clickBeerButton(){
		MyAction tempAP = new MyAction("Party schmeissen","Versuche die eifrigen Affen zu verkatern",0,-5,-20,0,-10,-50,-50);
		return tempAP;
	}
	
	public static MyAction clickDynamiteButton() {
		MyAction tempAP = new MyAction("Sabotiere Baustelle","Sabotiere die Baustelle mit etwas Explosiven",-5,0,-50,0,-5,-50,-50);
		return tempAP;
	}
}

