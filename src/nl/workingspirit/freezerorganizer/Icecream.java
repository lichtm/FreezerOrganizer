package nl.workingspirit.freezerorganizer;

public class Icecream extends Food {
String icecreamArray [] = new String [] {"magnums \t", "racketjes \t", "aardbeien ijsjes", "vanille ijs"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < icecreamArray.length;i++){
			System.out.println("| "+(i+1) +"- " +icecreamArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
}
