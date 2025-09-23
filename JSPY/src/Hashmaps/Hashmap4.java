package Hashmaps;

import java.util.HashMap;

public class Hashmap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		
		boolean result= same(s1, s2);
		System.out.println(result);
		
}

	private static boolean same(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length()) {
			return false;
		}
		
		HashMap<Character, 	Integer> l4 = new HashMap<Character, Integer>();
		
		for(char ch : s1.toCharArray()) {
			l4.put(ch, l4.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : s2.toCharArray()) {
			if(!l4.containsKey(ch)) {
				return false;
			}
			l4.put(ch, l4.get(ch)-1);
			
			if(l4.get(ch) == 0) {
				l4.remove(ch);
			}
		}
		return l4.isEmpty();
	}
}
