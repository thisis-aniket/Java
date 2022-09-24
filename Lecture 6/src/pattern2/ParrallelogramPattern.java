/*
Input: 7

Output:
*******
 *******
  *******
   *******
    *******
     *******
      *******
*/

package pattern2;

import java.util.Scanner;

public class ParrallelogramPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
