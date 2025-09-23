package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 2, 3, 2, 2, 1, 1};
		int n =arr.length;
		HashMap<Integer, Integer> l5 = new HashMap<Integer, Integer>();
		for(int I : arr) {
			l5.put(I, l5.getOrDefault(I, 0)+1);
			System.out.println(l5);
		}
		
		List<Integer> result =new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> num : l5.entrySet()) {
			if(num.getValue() > n/3) {
				result.add(num.getKey());
			}
		}
		
		System.out.println(result);
		}
	}

