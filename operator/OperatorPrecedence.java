package operator;

public class OperatorPresedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 5 + 2 * 4;
		int result2 = (5 + 2) * 4;
		
		System.out.println("Result: " + result);
		System.out.println(("Result2: " + result2));
		
		int x = 8, y = 4, z = 2, sum = 0;
		sum = x + --y + --z;
		System.out.println("Sum : " + sum);

	}

}
