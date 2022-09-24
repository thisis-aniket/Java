/*
Print pattern:

Input = 4

Output:
1234
1234
1234
1234
*/

package squarePatterns;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
