/*
Code : Triangle of Numbers

Print the following pattern for the given number of rows.

Pattern for N = 4
   1
  232
 34543
4567654

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5

Sample Output 1:
       1
      232
     34543
    4567654
   567898765
   
Sample Input 2:
4

Sample Output 2:
	   1
	  232
	 34543
	4567654
*/

package pattern2;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for (int i=1;i<=N;i++){
            
            int val=i;
            for (int j=1;j<=(N-i);j++){
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++){
                System.out.print(val);
                val++;
            }
            
            val--;
            for(int j=1; j<i; j++){
                val--;
                System.out.print(val);
            }
            System.out.println();
        }
        
	}

}
