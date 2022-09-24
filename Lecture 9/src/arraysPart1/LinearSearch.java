package arraysPart1;

import java.util.Scanner;

public class LinearSearch {
		
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static int search(int arr[], int element) {
		for(int i = 0; i < arr.length; i++) {
			if(element == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void print(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int noOfTestCases = sc.nextInt();
		int searchArray[] = new int[noOfTestCases];
		for(int i = 0; i < noOfTestCases; i++) {
			int[] input = inputArray();
			int element = sc.nextInt();
			searchArray[i] = search(input, element);
		}
		
		print(searchArray, noOfTestCases);

	}

}
