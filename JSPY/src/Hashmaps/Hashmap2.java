package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="programming";
		HashMap<Character, Integer> l2=new HashMap<Character, Integer>();

		for(char S : str.toCharArray()) {
			l2.put(S, l2.getOrDefault(S, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : l2.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}

	}

}

