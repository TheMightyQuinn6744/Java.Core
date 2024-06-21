package packagetest;

//Built in package
import java.util.Scanner;

//User-defined package
import packageoperation.*;
import packageoperationtwo.Sum;

public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int number1 = inputScanner.nextInt();
		System.out.println("Enter the second number:");
		int number2 = inputScanner.nextInt();
		
		packageoperationtwo.Sum sum = new packageoperation.Sum();
		
		System.out.println(number1 + " + " + number2 + " = " + sum.sumNumbers(number1, number2) + "\n");
		
		
		Multiply multiply = new Multiply();
		System.out.println(number1 + " * " + number2 + " = " + multiply.multiplyNumbers(number1, number2));
		
		inputScanner.close();
		System.out.println("Your totals has been returned above");
		
	}

}
