package com.gj2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class EventCreator {
	static ArrayList <MyEvent> neutralEvents = new ArrayList<MyEvent>();	
	static ArrayList <MyEvent> goodEvents = new ArrayList<MyEvent>(); 
	static ArrayList <MyEvent> badEvents = new ArrayList<MyEvent>();
	
	public EventCreator() {
		neutralEvents.add(new MyEvent("test neutral", // Event Name
				"test description neutral", // Event description
				0,0,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		neutralEvents.add(new MyEvent("Nuescht ist passiert", // Event Name
				"Einfach nichts passiert. Total langweilig. Nichtmal ein Tatort kommt im Fernsehen. Laaaaangweilig!", // Event description
				0,0,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 


		//Add good Events
		goodEvents.add(new MyEvent("test good", // Event Name
						"test description good", // Event description
						0,0,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		
		//Add good Events
		goodEvents.add(new MyEvent("Dynamit LKW hat Last verloren", // Event Name
						"Ein vorbeifahrender LKW hat Dynamit verloren, ja im Jungel fahren LKWs.Un der Fahrer hat sein Bier nicht ausgetrunken. ", // Event description
						0,4,1,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Zeppelinabsturz", // Event Name
						"Die Hindenburg 3.1 ist nahe deines Lagers abgestuerzt und hat Gueter verloren.", // Event description
						0,2,12,14,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Flussschwemme", // Event Name
								"Der naheliegende Fluss ist ueberschwemmt und hat Bierfaesser mitgetragen.", // Event description
								0,0,7,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Local Outlet Sale", // Event Name
								"Das Sprengstoff Outlet deiner Wahl hatte einen Sale", // Event description
								0,5,0,-5,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		
		//Add good Events
		goodEvents.add(new MyEvent("B-Ware", // Event Name
						"Dein Sprengstoff-Guy schenkt dir als Treuebonus etwas B-Ware", // Event description
						0,2,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Gnaedige Delphinsuperintelligenz", // Event Name
						"Die eigentliche Superintelligenz auf der Erde, aka. Delphine, unterstuetzen dich und trichtern den anderen etwas Wahrheit ein.", // Event description
						0,0,0,0,2,-5.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Strengeheime Elfentechonologie", // Event Name
						"Ein Zug, ja ein Zug im Jungel, wirft dir Sprengstoff ab. Choo Choo.", // Event description
						0,3,0,0,0,-1.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Land of Beer and Honey", // Event Name
						"Das Paradies auf Erden tritt ein und das Wasser im Fluss wird zu Bier", // Event description
						0,0,20,0,0,-2.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Staerkerbier", // Event Name
						"Dir faellt auf, dass du aus Versehen Starkbier besorgt hast, das ist natuerlich viel viel effektiver!", // Event description
						0,0,6,0,0,-5.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Projekt Bayer", // Event Name
						"Bayer testet seine neue Produktlinie:>>Instadrunk - Bier mit Aspirinflavour<< an dir. ", // Event description
						0,0,10,0,3,-1.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Duffman fills your need for beer", // Event Name
								"Duffman is thrusting the general Direction of the problem of getting them drunk!", // Event description
								0,0,0,0,5,-5.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("Attack of the Firenation", // Event Name
								"Everything Changed When The Fire Nation Attacked", // Event description
								0,0,0,0,0,0,-10.0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add good Events
		goodEvents.add(new MyEvent("WOLOLO", // Event Name
								"Dein Priester bekehrt die Tempelconstruction-Rampe", // Event description
								0,0,0,0,1,-2.0,-50.0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 		
		//Add good Events
		goodEvents.add(new MyEvent("Ladendiebstahl", // Event Name
								"Deine Affengang hatte die Schnappsidee einen Schnappsladen auszurauben.", // Event description
								0,0,11,15,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("test bad", // Event Name
					"test description bad", // Event description
					0,0,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Make it rain!", // Event Name !!- Nur wenn die Follower funktion implementiert wird!!
							"Du hast betrunken Fuffis durch den Club geschmissen und Follower gewonnen.", // Event description
							0,0,0,-50,2,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("LKW Unfall, Pfaendung!", // Event Name
							"Die letzte Lieferung deines Dynamit-Dealers ist verunglueckt. Er kommt bei dir pfaenden.", // Event description
							0,-2,0,-5,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Drug Enforcement", // Event Name
									"Die Drogenfahndung konfisziert all dein leckeres Bier.", // Event description
									0,0,-1000,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("Flashsale", // Event Name
							"In deinem lieblings Sprengstoffoutlet war ein Flashsale und du musst etwas zurueckbringen.", // Event description
							-10,1,0,-5,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Hitzewelle", // Event Name
									"Wegen der Hitzewelle sind einige Lunten bruechig geworden und du warst besonders durstig!", // Event description
									0,-3,-2,0,0,0,-1.0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Tropensturm", // Event Name
							"Wegen eines Tropensturms ist dein Lager voll gelaufen und das Dynamit ist nass.", // Event description
							0,-10,0,0,0,0,-2.0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Kaeferbefall", // Event Name
									"Radioaktive Insekten haben sich an deinem Dynamit und Bier guetlich getan.", // Event description
									0,-1,-1,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Hochwasser", // Event Name
							"Durch den Monsunregen sind Bierfaesser weg geschwemmt worden. Das Dynamit ist auch nass. Na toll!", // Event description
							0,-1,-10,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		
		//Add bad Events
		badEvents.add(new MyEvent("Gators", // Event Name
									"Dammn alligators ate your followers.", // Event description
									0,0,0,0,-10,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("Alkoholfreies Bier", // Event Name
							"Dir faellt auf, dass die letzte Lieferung alkoholfrei war, das bringt wohl nichts.", // Event description
							0,0,0,0,0,5.0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("DonkeyKong", // Event Name
									"DonkeyKong wirft mit deinen Bierfaessern", // Event description
									0,0,-5,0,0,0,-1.0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("Scherben bringen Glueck, right?", // Event Name
							"Einige Flaschen sind kaputt gegangen", // Event description
							0,0,-3,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("test bad", // Event Name
									"test description bad", // Event description
									0,0,0,0,0,0,0)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
		//Add bad Events
		badEvents.add(new MyEvent("Feiertag", // Event Name
							"Die Zealots hatten einen Feiertag und waren besonders produktiv", // Event description
							0,0,0,0,0,0,+200)); 		// AP Kosten,Dynamite, Beer, Money, Follower, Zeal, Progress 
							/*
							 * 					
							 */
	}
	
	// arrayID 0 = neutral, 1 = good, 2 = bad
	public static MyEvent getEventValue(int arrayID) {
		switch(arrayID) {
		case 0: {
				return neutralEvents.get(ThreadLocalRandom.current().nextInt(0, neutralEvents.size()));
			}
		case 1: {
				return goodEvents.get(ThreadLocalRandom.current().nextInt(0, goodEvents.size()));
			}
		case 2: {
				return badEvents.get(ThreadLocalRandom.current().nextInt(0, badEvents.size()));
			}
		default: {
				return neutralEvents.get(0);
			}
		}
	}
}

