/*
Code : Diamond of stars

Print the following pattern for the given number of rows.

Note: N is always odd.

Pattern for N = 5

  *
 ***
*****
 ***
  *

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49

Sample Input 1:
5

Sample Output 1:
  *
 ***
*****
 ***
  *

Sample Input 2:
3

Sample Output 2:
  *
 ***
  *
  
*/

package pattern2;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n/2;
		int val = n - 2;

		for(int i = 1; i <= (n/2) + 1; i++) {
			
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			
			spaces--;
			
			for(int j = 1; j <= (2*i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		spaces = 1;
		for(int i = 1; i <= (n/2); i++) {
			
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			
			spaces++;
			
			for(int j = 1; j <= val; j++) {
				System.out.print("*");
			}
			val -= 2;
			
			System.out.println();
		}

	}

}
