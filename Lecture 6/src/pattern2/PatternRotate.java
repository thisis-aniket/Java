package pattern2;

import java.util.Scanner;

public class PatternRotate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int val = 0;
		int n = sc.nextInt();
		
		int startDigit = 0;
		int reminder = 0;
		
		for(int i = 1; i <= n; i++) {
			val += (int) (Math.pow(10, n - i) * (2 * i - 1));
		}
		
		System.out.println(val);

		for(int i = 1; i < n; i++) {
			startDigit = (int) (val / Math.pow(10, n - 1));
			reminder = (int) (val % Math.pow(10, n - 1));
			
			val = (int) (reminder * Math.pow(10, 1) + startDigit);
			
			System.out.println(reminder + "" + startDigit);
		}

	}

}
