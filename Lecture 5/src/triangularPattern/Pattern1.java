/*
Input: 4

Output:
1
12
123
1234
*/

package triangularPattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
