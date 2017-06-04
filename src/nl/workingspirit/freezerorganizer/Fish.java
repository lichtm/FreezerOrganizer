package nl.workingspirit.freezerorganizer;

public class Fish extends Food {
String fishArray [] = new String [] {"vissticks \t", "pangafilet \t"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < fishArray.length;i++){
			System.out.println("| "+(i+1) +"- " +fishArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
}
