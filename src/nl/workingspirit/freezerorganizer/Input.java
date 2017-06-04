package nl.workingspirit.freezerorganizer;

import java.util.Scanner;

public class Input {
	public String input;
	
	public void newInput(){
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
//		System.out.println(input);
	}

}
