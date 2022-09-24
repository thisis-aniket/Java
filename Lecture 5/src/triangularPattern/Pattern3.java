/*
Input: 4

Output: 
1
23
456
78910

*/

package triangularPattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int start = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(start);
				start++;
			}
			System.out.println();
		}
		
		
	}

}
