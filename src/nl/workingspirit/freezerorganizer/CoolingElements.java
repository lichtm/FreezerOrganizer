package nl.workingspirit.freezerorganizer;

public class CoolingElements extends Item1 /*implements Houdbaarheid */{
	String coolingArray [] = new String [] {"koelelement", "coldpack \t"};
	
	public void ListItem() {
		System.out.println	  ("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println	  ("| -------------------------------------------------- |");
		for (int i = 0; i < coolingArray.length;i++){
			System.out.println("| "+(i+1) +"- " +coolingArray[i] +"\t\t |");
		}
		System.out.println	  ("| -------------------------------------------------- |");
	}
//	public String datumIn(){
//		
//	}
//	public String datumOut(){
//		
//	}
//	public int weight_AmountOf(int weight, int amountOf){
//		
//	}
}
