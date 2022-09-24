import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Aniket");
		list.add("Malhar");
		list.add("Rahul");
		
//		Iterator 
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(list);		//[Aniket, Malhar, Rahul]
		
		list.get(0);		//Aniket
		
		list.set(2, "Pratik");
		
		list.remove(2);
		
		System.out.println(list);
		System.out.println(list.size());
		
//		For loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		For each loop
		for(String i : list) {
			System.out.println(i);
		}
		
		Collections.sort(list);
		
//		Clear 
		list.clear();

	}

}
