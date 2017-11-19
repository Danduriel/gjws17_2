package com.gj2;

public class ActionCreator {
	// AP Kosten, Dynamite, Beer, Money, Follower, Zeal, Progress 
	public static MyAction clickBeerButton(){
		MyAction tempAP = new MyAction("Party schmeissen","Versuche die eifrigen Affen zu verkatern.",-1,0,-10,0,2,-5.0,0.0);
		return tempAP;
	}
	
	public static MyAction clickDynamiteButton() {
		MyAction tempAP = new MyAction("Sabotiere Baustelle","Sabotiere die Baustelle mit einem Selbstmordattentäter.",-2,-1,0,0,-1,0.0,-10);
		return tempAP;
	}
	
	public static MyAction clickBunButton() {
		MyAction tempAP = new MyAction("Bun Alert!","Du lenkst alle Affen ab, in dem du flauschige Kaninchen auf der Baustelle loslaesst.",-1,0,0,-5,1,-2.0,-1.0);
		return tempAP;
	}
	
	public static MyAction clickPommesButton() {
		MyAction tempAP = new MyAction("Lebensmittelvergiftung","Du verkaufst den hungrigen Bauarbeiter-Affen ranzige Pommes.",-5,0,-1,10,0,-10.0,0);
		return tempAP;
	}
	
	public static MyAction clickShoesButton() {
		MyAction tempAP = new MyAction("Schnuersenkel-Chaos","Du bindest die Schnuersenkel aller Bauarbeiter-Affen aneinander.",-3,0,0,0,0,-4.0,0);
		return tempAP;
	}
	
	public static MyAction clickBusButton() {
		MyAction tempAP = new MyAction("Bestechung","Der Busfahrer faehrt auf dem Weg zur Tempel-Baustelle 'aus Versehen' einen Umweg.",-1,0,-1,-15,0,-8.0,0);
		return tempAP;
	}
	
	public static MyAction clickDixiButton() {
		MyAction tempAP = new MyAction("Dixis umschubsen","Das wird ein laaaanger Tag fuer alle Bauarbeiter-Affen. Und dieser Duft erst.",-10,0,0,0,0,-20.0,-1.0);
		return tempAP;
	}
	
	
}

