import java.util.Scanner;

public class Relational {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		boolean isEq = (i == j);
		boolean isGr = (i > j);
		boolean isGrEq = (i >= j);
		boolean isLs = (i < j);
		boolean isLsEq = (i <= j);
		boolean isNotEq = (i != j);
		
		System.out.println("is equal:" + isEq);
		System.out.println("is greater:" + isGr);
		System.out.println("is greater Equal:" + isGrEq);
		System.out.println("is less:" + isLs);
		System.out.println("is less equal:" + isLsEq);
		System.out.println("is not equal:" + isNotEq);
	}

}
