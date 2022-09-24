package arraysPart1;

import java.util.Scanner;

public class ReturnArraySum {
	
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static int sumOfArray(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
	
	public static void print(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int noOfArray = sc.nextInt();

		int sumArray[] = new int[noOfArray];
		
		for(int i = 0; i < noOfArray; i++) {
			int arr[] = inputArray();
			sumArray[i] = sumOfArray(arr);
		}
			
		print(sumArray, noOfArray);	
	
	}

}
