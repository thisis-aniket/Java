/*
Print pattern:

Input = 4

Output:
1111
2222
3333
4444
*/
package squarePatterns;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
