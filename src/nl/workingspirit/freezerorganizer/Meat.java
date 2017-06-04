package nl.workingspirit.freezerorganizer;

public class Meat extends Food {
String meatArray [] = new String [] {"gehakt \t\t", "kipfilet \t", "hamburgers \t", "beenham \t", "rolladeschijven"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < meatArray.length;i++){
			System.out.println("| "+(i+1) +"- " +meatArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}

}
