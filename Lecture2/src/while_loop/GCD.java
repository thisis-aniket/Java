package while_loop;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int small, i = 1, num1, num2, gcd = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		small = (num1 < num2) ? num1 : num2;
		
		while(i <= small) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		
		System.out.println("GCD:" + gcd);
		
		sc.close();
	}

}
