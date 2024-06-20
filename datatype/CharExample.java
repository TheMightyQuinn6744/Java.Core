package datatype;

import java.net.Socket;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Char Data Type -> 0-65535 'A'
		char c1 = 'H';//72 in decimal
		char c2 = '5';//53 in decimal
		
		System.out.println("c1: " + c1);
		System.out.println("is first variable letter ? " + Character.isLetter(c1));
		System.out.println("is first variable letter ? " + Character.isDigit(c1));
		
		System.out.println("c2: " + c2);
		System.out.println("is second variable letter ? " + Character.isLetter(c2));
		System.out.println("is second variable letter ? " + Character.isDigit(c2));
		
		char letter1 = 67;//C
		int num1 = letter1 + 3;//67 + 3 = 70 -> F
		char letter2 = (char) num1;//F
		
		System.out.println("letter2 is " + letter2);//F
		
		char letter3 = 70;//F
		char letter4 = letter3--;//letter = 70 letter 3 = 69
		boolean check1 = letter4 == 'E'; //false != E
		boolean check2 = letter3 > 'D'; //69 -> E > D true
		
		System.out.println("check1: " + check1);
		System.out.println("check2: " + check2);

	}

}
