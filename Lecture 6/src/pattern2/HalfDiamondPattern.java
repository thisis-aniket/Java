/*
Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3

Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2 :
5
 
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

package pattern2;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int val = 0;
		
		System.out.println("*");
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("*");
			
			val = 1;
			
			for(int j = 1; j <= i; j++) {
				System.out.print(val);
				val++;
			}
			
			val--;
			
			for(int j = 1; j < i; j++) {
				--val;
				System.out.print(val);
			}
			
			System.out.print("*");
			
			System.out.println();
		}
		
		for(int i = 1; i < n; i++) {
			
			val = 1;
			
			System.out.print("*");
			
			for(int j = 1; j <= n - i; j++) {
				System.out.print(val);
				val++;
			}
			
			--val;
			
			for(int j = 1; j < n - i; j++) {
				val--;
				System.out.print(val);
			}
			
			System.out.print("*");
			
			System.out.println();
			
		}
		
		System.out.println("*");
	}

}
