package nl.workingspirit.freezerorganizer;

public class Fruit extends Food {
String fruitArray [] = new String [] {"frambozen \t", "bosbessen \t"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < fruitArray.length;i++){
			System.out.println("| "+(i+1) +"- " +fruitArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
}
