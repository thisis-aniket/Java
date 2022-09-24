import java.util.Scanner;

public class AvarageMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String name;
        int m1,m2,m3;
        name=scan.next();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
        
        int avg = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(avg);
        scan.close();

	}

}
