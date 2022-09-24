/*
Input: 4

Output:
1
23
345
4567
*/


package triangularPattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			int startNumber = i;
			while(j <= i) {
				System.out.print(startNumber);
				startNumber++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
