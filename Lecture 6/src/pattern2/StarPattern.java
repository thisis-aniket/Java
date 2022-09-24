/*
Code : Star Pattern

Print the following pattern
Pattern for N = 4

   *
  ***
 *****
*******

Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****

Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******

*/

package pattern2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n - i){
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while(j <= i - 1){
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            i++;
        }

	}

}
