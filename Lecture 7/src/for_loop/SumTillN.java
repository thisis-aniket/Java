package for_loop;

import java.util.Scanner;

public class SumTillN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int sum = 0;
//		int i = 0;
//		
//		while(i <= n) {
//			sum += i;
//			i++;
//		}
//
//		System.out.println(sum);
		
		
		int sum = 0;
		for(int i = 1, j = 1; i <= n; i++, j++) {
			sum += i;
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
