package inputoutput;

import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputNumberScanner = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int number = inputNumberScanner.nextInt();
		System.out.println("You entered : " + number);
		inputNumberScanner.close();
	}

}
