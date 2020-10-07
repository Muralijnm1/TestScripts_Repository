package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> Hset = new HashSet<String>();
		Hset.add("One");
		Hset.add("Two");
		Hset.add("Three");
		Hset.add("Four");
		Hset.add("Four");
		Hset.add("Five");
		
		System.out.println("The Hset elements are"+Hset);
		System.out.println("The Hset size is "+Hset.size());		
		HashSet<String> Hset1 = new HashSet<String>();
		Hset1=(HashSet<String>) Hset.clone();
		System.out.println("The Hset1 elements are"+Hset1);
	
		String[] array1 = new String[Hset1.size()];
		Hset.toArray(array1);

		System.out.println("The array elements are after copy");
		for(String x:array1){
			System.out.println(" "+x);
		}
		
		
		List<String> list1 = new ArrayList<String>(Hset);	
		System.out.println("The list elements are after copy");
		for(String y:list1){
			System.out.println(" "+y);
		}
		
		Hset.add("Six");
		Hset.retainAll(Hset1);

		System.out.println("The Hset1 elements are after retain all"+Hset1);
		Hset.removeAll(Hset);

		System.out.println("The Hset1 elements are after remove all of Hset1"+Hset);

		System.out.println("The Hset1 elements are after remove all of Hset1 "+Hset.isEmpty());

	}

}
