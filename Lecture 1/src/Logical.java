import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean isLargest = ((a >= b) && (a >= c));
		System.out.println(isLargest);
		
		System.out.println((a >= b) || (a >= c));
		System.out.println(!(a > b));
	}

}
