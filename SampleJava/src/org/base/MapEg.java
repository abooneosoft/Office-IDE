package org.base;

import java.util.HashMap;
import java.util.Map;

public class MapEg {

	public static void main(String[] args) {
		
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('a', 1);
		mp.put('b', 1);
		mp.put('c', 1);
		
		
		System.out.println(mp.get('c'));
	}
}
