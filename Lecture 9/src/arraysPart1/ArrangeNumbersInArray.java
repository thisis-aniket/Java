package arraysPart1;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	
	public static void arrangeNumber(int arr[], int length) {
		Scanner sc = new Scanner(System.in);
		
		int midElement = length;

		if(length <= 0) {
			System.out.println("We can't create array of length 0 or negative.");
		}else {
			int mid = length / 2;

			int temp = 1;
			for(int i = 0; i < mid; i++) {
				arr[i] = temp;
				temp += 2;
			}

			arr[mid] = midElement;
			
			if(length % 2 == 0)
				temp = midElement - 2;
			else
				temp = midElement - 1;
			
			for(int i = mid + 1; i < length; i++) {
				arr[i] = temp;
				temp -= 2;
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		arrangeNumber(arr, length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
