package bitwise;

public class IncreamentAndDecreament {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(a++);		//10 
		
		System.out.println(++a);		//12
		
		int b = ++a;
		System.out.println(b);			//13
		
		int c = 20;
		
		c += 20;
		
		System.out.println(c);
		
		
//		1. Spot the error in line		
//		int a=10,b=20;
//	    System.out.println(a+++--b);//line 1
//	    System.out.println(a--+++b);//line 2
//	    System.out.println(a++-++b);//line 3
//	    System.out.println(a+++++b);//line 4
		
//		2. Give the correct output
//		int a=10,b=20;
//	    int c=a&b;
//	    System.out.print(c);
//	    int d=a|b;
//	    System.out.print(d);
//	    int e=a^b;
//	    System.out.print(e);
//	    int f=c+d+e;
//	    System.out.print(~f);
		
		
//		3. Correct Output
//		int a=10,b=-20;
//	    System.out.print(a^b);
	}

}
