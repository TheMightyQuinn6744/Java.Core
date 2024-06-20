package array;

import java.util.Arrays;

public class SearchingInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0,2,4,6,8,10};//sorted array
		int indexOfEight =Arrays.binarySearch(numbers, 8);
		System.out.println("index of 8: " + indexOfEight);
		
		int indexOfSeven =Arrays.binarySearch(numbers, 7);
		System.out.println("index of 7: " + indexOfSeven);
		
		String[] animalStrings = {"Cat","cOW","dOG","Elephant","Lion","Monkey"};
		int indexOfDog = Arrays.binarySearch(animalStrings,"Dog");//2
		System.out.println("index of Dog: " + indexOfDog);

	}

}
