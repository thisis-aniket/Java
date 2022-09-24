package breakContinue;

public class ContinueDemo {

	public static void main(String[] args) {
		
		int i = 1, n = 10;
		
//		while(i <= n) {
//			if(i == 5) {
//				i++;
//				continue;
//			}
//			
//			System.out.println(i);
//			i++;
//		}
		
		
		for(int k = 1; k <= n; k++) {
			if(k == 5) {
				continue;
			}
			System.out.println(k);
		}
		
	}

}
