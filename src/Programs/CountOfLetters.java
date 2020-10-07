package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> hMap = new HashMap<Character,Integer>();
		String string ="Greetings for you all KKK";
		for(int i=0;i<=(string.length()-1);i++){
			hMap.put(string.charAt(i),0);
		}
		
		System.out.println("The Hmap is "+hMap);
		
		for(Map.Entry<Character,Integer> x:hMap.entrySet()){
		
			Integer count = 0;
		for(int j=0;j<=(string.length()-1);j++){
			Character chr = x.getKey();
			if(string.charAt(j)==chr){
			count++;				
			}
		}
		x.setValue(count);
		}

		System.out.println("The Hmap is "+hMap);
	}

}
