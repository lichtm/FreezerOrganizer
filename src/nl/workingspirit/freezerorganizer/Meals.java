package nl.workingspirit.freezerorganizer;

public class Meals extends Food {
String mealsArray [] = new String [] {"pizza \t\t", "pasta \t\t", "stamppot \t", "chinees \t"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < mealsArray.length;i++){
			System.out.println("| "+(i+1) +"- " +mealsArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
}
