//Input: 4

//Output:
//ABCD
//BCDE
//CDEF
//DEFG

package charPattern;

import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int startChar = 65;
		
		int  i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print((char)(startChar + j - 1));
				j++;
			}
			System.out.println();
			startChar++;
			i++;
		}

	}

}
