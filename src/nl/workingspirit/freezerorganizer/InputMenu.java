package nl.workingspirit.freezerorganizer;

public class InputMenu extends Input{

	public void inputMenu(){
		System.out.println("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println("| -------------------------------------------------- |");
		System.out.println("| in  - Invriezen nieuw item(s)                      |");
		System.out.println("| uit - Uitgenomen bevroren item(s)                  |");
		System.out.println("| l   - Lijst ingevroren item(s)                     |");
		System.out.println("| xxx - programma afsluiten                          |");
		System.out.println(" ====================================================");
		newInput();

		switch(input){
		case "in": case "uit": {
			freezingItem();
		} break;
		case "l": {
			//				listMenu();
		} break;
		case "xxx": {
			System.out.println("Programma beëindigd.");
		} break;
		default : {
			System.out.println("\t Onjuiste keuze. Probeer opnieuw.");
		} break;
		}
	}


	public void freezingItem(){
		System.out.println    ("| -------------------------------------------------- |");
		if (input.equals("in"))
			System.out.println("| Wat voor item wil je invriezen?                    |");
		if (input.equals("uit"))
			System.out.println("| Wat voor item wil je uit de vriezer halen?         |");
		System.out.println    ("| -------------------------------------------------- |");
		System.out.println    ("| E   - Eten en Drinken                              |");
		System.out.println    ("| A   - Anders                                       |");
		System.out.println    ("| T   - terug                                        |");
		System.out.println    ("  --------------------------------------------------  ");

		newInput();

		switch(input){
		case "e": case "E" :{
//			foodItem();
		} break;
		case "a": case "A" :{
//			coolingItem();
		} break;
		case "t": case "T" :{
			inputMenu();
		} break;
		default : System.out.println("\t Onjuiste keuze. Probeer opnieuw.");
		}
	}


	public void freezingCoolingElement(){
		System.out.println("");
	}
	//		Food
	//		CoolingElements



}
