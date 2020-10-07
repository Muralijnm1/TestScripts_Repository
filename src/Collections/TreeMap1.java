package Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> numbers = new TreeMap<>();
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(5, "Five");
		System.out.println("");
		System.out.println("The size of the TreeMap is "+numbers.size());	
		
		for(Map.Entry x:numbers.entrySet()){
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println("The 1st entry is "+numbers.firstEntry());
		System.out.println("The last entry is "+numbers.lastEntry());		
		if(numbers.containsKey(3)){
			System.out.println("The given number exist");
		}
		else
		{
			System.out.println("The given number not exist");
		}
		

		System.out.println("The lower entry for key 3 is "+numbers.lowerKey(3));

		System.out.println("The higer entry for key 3 is "+numbers.higherKey(3));

	}

}
