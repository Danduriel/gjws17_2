package com.gj2;

public class ActionCreator {
	// AP Kosten, Dynamite, Beer, Money, Might, Zeal, Progress 
	public static MyAction clickBeerButton(){
		MyAction tempAP = new MyAction("Party schmeissen","Versuche die eifrigen Affen zu verkatern.",0,-5,-20,0,-10,-50,-50);
		return tempAP;
	}
	
	public static MyAction clickDynamiteButton() {
		MyAction tempAP = new MyAction("Sabotiere Baustelle","Sabotiere die Baustelle mit etwas Explosiven.",-5,0,-50,0,-5,-50,-50);
		return tempAP;
	}
	
	public static MyAction clickBunButton() {
		MyAction tempAP = new MyAction("Bun Alert!","Du lenkst alle Affen ab, in dem du flauschige Kaninchen auf der Baustelle losl�sst.",0,0,0,0,0,0,0);
		return tempAP;
	}
	
	public static MyAction clickPommesButton() {
		MyAction tempAP = new MyAction("Lebensmittelvergiftung","Du verkaufst den hungrigen Bauarbeiter-Affen ranzige Pommes.",0,0,0,0,0,0,0);
		return tempAP;
	}
	
	public static MyAction clickSchoesButton() {
		MyAction tempAP = new MyAction("Schnuersenkel-Chaos","Du bindest die Schnuersenkel aller Bauarbeiter-Affen aneinander.",0,0,0,0,0,0,0);
		return tempAP;
	}
	
	public static MyAction clickBusButton() {
		MyAction tempAP = new MyAction("Bestechung","Der Busfahrer faehrt auf dem Weg zur Tempel-Baustelle 'aus Versehen' einen Umweg.",0,0,0,0,0,0,0);
		return tempAP;
	}
	
	public static MyAction clickDixiButton() {
		MyAction tempAP = new MyAction("Dixis umschubsen","Das wird ein laaaanger Tag fuer alle Bauarbeiter-Affen. Und dieser Duft erst.",0,0,0,0,0,0,0);
		return tempAP;
	}
	
	
}

