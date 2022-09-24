/*
Output:
[1,2]
[1,3]
[1,4]
[1,5]
[2,3]
[2,4]
[2,5]
[3,4]
[3,5]
[4,5]

*/

package arraysPart1;

public class AllPairs {

	public static void allPair(int arr[]) {
		
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				System.out.println("[" + arr[i] + "," + arr[j] + "]");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		allPair(arr);

	}

}
