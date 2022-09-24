/*
Code : Reverse Number Pattern
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
 */

package triangularPattern;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num;
		
		for(int i = 1; i <= n; i++){
            num = i;
            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num--;
 
            }
            System.out.println();
        }

	}

}
