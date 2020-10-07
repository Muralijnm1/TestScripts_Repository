package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hMap1 = new HashMap<Integer,String>();
hMap1.put(1, "One");
hMap1.put(2, "Two");
hMap1.put(3, "Three");
hMap1.put(4, "Four");
hMap1.put(6, "Four");
hMap1.put(5, "Five");
System.out.println("The size of the hash map is "+hMap1.size());
System.out.println("The hash map values are");
for(Map.Entry x:hMap1.entrySet()){
	System.out.println(x.getKey()+" "+x.getValue());
}

HashMap<Integer,String> hMap2 = new HashMap<Integer,String>();

hMap2.putAll(hMap1);
System.out.println("The hash map values after copy");
for(Map.Entry y:hMap2.entrySet()){
	System.out.println(y.getKey()+" "+y.getValue());
}
if(hMap1.containsKey(3))
{
	System.out.println("The given key exists "+hMap1.get(3));	
}
else
{
	System.out.println("The given key does not exist"+" ");
}

Set set = hMap1.entrySet();

System.out.println("The elements after converting into set "+set);

hMap2.clear();
if(hMap2.isEmpty()){
	System.out.println("The hash map2 is empty");
}
	else{
		System.out.println("The hash map2 is not empty");
}
	
	}
	

}
