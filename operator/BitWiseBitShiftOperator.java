package operator;

public class BitWiseBitshiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------Bitwise AND (&) Operator--------------------------------");
		
		//Bitwise AND (&)
		int num1 = 8;//1000 in binary
		int num2 = 9;// 1001 in binary
		
		System.out.println("num1 as binary: " + Integer.toBinaryString(num1));
		System.out.println("num2 as binary: " + Integer.toBinaryString(num2));
		System.out.println("num1 as num2 as binary: " + Integer.toBinaryString(num1&num2));
		System.out.println("num1 as num2 as decimal: " + (num1&num2));
		
		
		System.out.println("-----------------------Bitwise AND (|) Operator--------------------------------");
		
		//Bitwise Exclusive OR (^)
		int num3 = 8;//1000
		int num4 = 9;//1001
					// 0001 -> 9 in decimal
		System.out.println("num3 as binary: " + Integer.toBinaryString(num3));
		System.out.println("num3 as binary: " + Integer.toBinaryString(num4));
		System.out.println("num3 | num4 as binary: " + Integer.toBinaryString(num3|num4));
		System.out.println("num3 as binary: " + Integer.toBinaryString(num3|num4));
		
		System.out.println("-----------------------Bitwise OR (^) Operator--------------------------------");
		
		//Bitwise Exclusive OR (^)
		int num5 = 8;//1000
		int num6 = 9;//1001
					// 0001 -> 9 in decimal
		System.out.println("num5 as binary: " + Integer.toBinaryString(num5));
		System.out.println("num5 as binary: " + Integer.toBinaryString(num6));
		System.out.println("num5 | num6 as binary: " + Integer.toBinaryString(num5^num6));
		System.out.println("num5 as binary: " + Integer.toBinaryString(num5^num6));
	}

}
