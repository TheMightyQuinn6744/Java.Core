package methods;

import java.util.Scanner;

public class VarArgsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter the numbers you want to sum, leaving a space between them.");
			String[] inputNumbers = scanner.nextLine().split(" ");
			sumNumbers(inputNumbers);
			System.out.println("Do you want to continue (Y for Yes, N for No):");
			
			char response = scanner.nextLine().charAt(0);
			
			if (response == 'n' || response == 'N') {
				
				System.out.println("-----The program is terminated------");
				break;
			}
			scanner.close();
		}
		
		

	}

	public static void sumNumbers (String...numbers) {
		int sum = 0;
		String enteredNumber ="";
		
		for (int i = 0; i < numbers.length; i++) {
			
			sum += Integer.parseInt(numbers[i]);
			
			if (i != numbers.length - 1) {
				
				enteredNumber += numbers[i]+ " + "; 
			}else {
				enteredNumber += numbers[i];
			}
		}
		System.out.println(enteredNumber + " = " + sum);
	}
}
