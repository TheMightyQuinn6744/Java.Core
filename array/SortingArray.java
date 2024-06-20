package array;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sorting double array
		double[] array1 = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
		System.out.println("unsorted array: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("sorted array: " + Arrays.toString(array1));
		
		//Sorting char array
		char[] array3 = {'F','B','b','H','c','A'};
		System.out.println("unsorted array: " + Arrays.toString(array3));
		Arrays.sort(array3);
		System.out.println("sorted array: " + Arrays.toString(array3));
		
		//Sorting char array
		String[] array4 = {"Cat","Dog","Monkey","Lion","elephant","Cow"};
		System.out.println("unsorted array: " + Arrays.toString(array3));
		Arrays.sort(array4);
		System.out.println("sorted array: " + Arrays.toString(array3));

	}

}
