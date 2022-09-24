/*
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
4444
4444
4444

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777

Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666
*/

package squarePatterns;
import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
