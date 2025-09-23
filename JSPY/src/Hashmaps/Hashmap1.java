package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 1, 4, 2};
		HashMap<Integer, Integer> l1 = new HashMap<Integer, Integer>();
		for(Integer E : arr) {
			l1.put(E, l1.getOrDefault(E, 0) + 1);
			System.out.println(l1);
		}
		
		for(Map.Entry<Integer, Integer> entry : l1.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}

	}

}
