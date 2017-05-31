package nl.workingspirit.freezerorganizer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;

public class Freezer1 {
	public static void main (String[] args){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalDate date1 = LocalDate.of(2017, 05, 31);
		System.out.println(" ====================================================");
		System.out.println("| FreezerOrganizer \t\t\t" +formatter.format(date1) +"  |");
		System.out.println("|====================================================|");
		System.out.println("| Maak een keuze uit onderstaande mogelijkheden:     |");
		System.out.println("| -------------------------------------------------- |");
		System.out.println("| l   - Lijst ingevroren item(s)                     |");
		System.out.println("| in  - Invriezen nieuw item(s)                      |");
		System.out.println("| uit - Uitgenomen bevroren item(s)                  |");
		System.out.println(" ====================================================");
		Item1 item1 = new Item1();
		item1.Item1();
	}
}
