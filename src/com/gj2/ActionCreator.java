package com.gj2;

import com.badogic.drop.MyAP;

public class APCreator {
	public APCreator() {
		//MyAP myAP = new MyAP("","",0,0,0,0,0,0,0);
	}
	
	//Dummy ButtonFunktion
	// Dynamite, Beer, Money, Might, Zeal, Progress, AP Kosten
	public static MyAP clickBeerButton(){
		MyAP tempAP = new MyAP("Party schmei�en","Versuche die eifrigen Affen zu verkatern",0,-5,-20,0,-10,-50,-50);
		return tempAP;
	}
	
	public static MyAP clickDynamiteButton() {
		MyAP tempAP = new MyAP("Sabotiere Baustelle","Sabotiere die Baustelle mit etwas Explosiven",-5,0,-50,0,-5,-50,-50);
		return tempAP;
	}
}

