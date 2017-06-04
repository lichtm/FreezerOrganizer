package nl.workingspirit.freezerorganizer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//import java.util.Scanner;

public class Freezer1 {
	
	public static void main (String[] args){
//		String input;
//		Scanner sc = new Scanner(System.in);
		InputMenu inputMenu = new InputMenu();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalDate date1 = LocalDate.of(2017, 05, 31);
		System.out.println(" ====================================================");
		System.out.println("| FreezerOrganizer \t\t\t" +formatter.format(date1) +"  |");
		System.out.println("|====================================================|");
		inputMenu.inputMenu();
	}	
		
}
