package while_loop;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = 2;
		
		while(d < n) {
			if(n % d == 0) {
				System.out.println("Not Prime");
				return;
			}
			d = d + 1;
		}
		System.out.println("Prime");
	}

}
