package pattern2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {

			int val = 1;
			
			for(int j = 2; j <= i; j++) {
		
				System.out.print(val + " + ");
				val++;
			}
			
			System.out.print(val + " = ");
			
			int sum = 0;
			
			for(int j = 1; j <= i; j++) {
				sum = sum + j;
			}
			
			System.out.print(sum);
			
			System.out.println();
		}

	}

}
