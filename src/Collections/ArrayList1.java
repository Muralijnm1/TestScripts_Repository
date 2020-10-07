package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList1 {
	public static void printList(List<String> words){
		Iterator<String> iterator = words.iterator();
		while(iterator.hasNext()){
			String word = iterator.next();
			System.out.println(word+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> words = new ArrayList<String>();
words.add("Zero");
words.add("One");
words.add("Two");
words.add("Three");
words.add("Four");
words.add("Four");
words.add("Five");

System.out.println("The elements in Array list are "+words);

printList(words);
words.add(0,"Zero1");
System.out.println("<insert via index");
printList(words);
words.set(1, "work");
System.out.println(">update via index");
printList(words);
words.remove(0);

System.out.println("after remove");
printList(words);

	}

}
