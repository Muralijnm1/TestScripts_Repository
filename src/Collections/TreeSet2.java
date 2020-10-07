package Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> numbers = new TreeSet<String>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Four");
		numbers.add("Five");
		for(String number : numbers){
			System.out.println(number);
		}
		System.out.println(" ");
		Iterator<String> itr = numbers.iterator();
		System.out.println("The TreeSet by iterator is");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(numbers.size());
		if(numbers.contains("Three")){
			System.out.println("The number exist");			
		}
		else
		{
			System.out.println("The number not exist");
		}
		System.out.println("The 1st item is "+numbers.first());
		System.out.println("The last item is "+numbers.last());
		System.out.println("The the lower item for Three is "+numbers.lower("Three"));
		System.out.println("The higher item for the Three is "+numbers.higher("Three"));
		System.out.println("The poll 1st item is "+numbers.pollFirst());
		System.out.println("The poll last item is "+numbers.pollLast());
		
		
		
	}
	

}
