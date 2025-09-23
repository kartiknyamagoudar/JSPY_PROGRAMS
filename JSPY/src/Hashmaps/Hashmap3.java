package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 1, 4, 2};
		
		HashMap<Integer, Integer> l3=new HashMap<Integer, Integer>();
		for(int I : arr) {
			l3.put(I, l3.getOrDefault(I, 0)+1);
			System.out.println(l3);
		}
		
		int maxkey =-1;
		int maxval =-1;
		
		for(Map.Entry<Integer, Integer> entry : l3.entrySet()) {
			if(entry.getValue()>maxval) {
				maxkey=entry.getKey();
				maxval=entry.getValue();
				}
			
		}
		System.out.println(maxkey+" = " +maxval);
	}

}
