/*
Nth Fibonacci Number

Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  0, 
           F(2) = 1
           
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
    The first line of each test case contains a real number ‘N’.

The first line of each test case contains a real number ‘N’.
Output Format :
	For each test case, return its equivalent Fibonacci number.

For each test case, return its equivalent Fibonacci number.
Constraints:
1 <= N <= 10000     
Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second
Sample Input 1:
6

Sample Output 1:
8

Explanation of Sample Input 1:
Now the number is ‘6’ so we have to find the “6th” Fibonacci number
So by using the property of the Fibonacci series i.e 

[ 1, 1, 2, 3, 5, 8]
So the “6th” element is “8” hence we get the output.
*/

package for_loop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 1, c = 0;
        int n = sc.nextInt();
        
        if(n == 0) {
            System.out.println(c);
        }else if(n == 1){
            c = 1;
            System.out.println(c);
        }else{
            for(int i = 1; i < n; i++){
            	c = a + b;
            	a = b;
            	b = c;
        	}
            System.out.println(c);
        }

	}

}
