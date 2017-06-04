package nl.workingspirit.freezerorganizer;

public class Vegetables extends Food {
	String vegetableArray [] = new String [] {"bietjes \t", "spercieboontjes", "spinazie \t", "rode kool\t", "prei \t\t"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < vegetableArray.length;i++){
			System.out.println("| "+(i+1) +"- " +vegetableArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
}
