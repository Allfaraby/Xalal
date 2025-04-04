package Main2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	String animal = console.nextLine();
	String big = "Свинья";
     System.out.println( animal.toLowerCase().equals(big.toLowerCase()) ? 1:2);
	    
	}

}
