package org.base;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StringDup {
	public static void main(String[] args) {
		
		String st= "Nnneeooosoffttt";
		String a = st.toLowerCase();
		Map<Character, Integer> mapValue = new Hashtable<>();
		
		char[] characters = a.toCharArray();
		System.out.println( "This is how the character of array storing, "+"characters[0]+characters[1]:"+characters[0]+characters[1]);
		System.out.println(characters.length);
		for (char c : characters) {
			if(mapValue.containsKey(c)) {
				mapValue.put(c,mapValue.get(c)+1);
			}else {
				mapValue.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : mapValue.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
//		Map<Integer, String> mp = new HashMap<Integer, String>();
//		
//		mp.put(11361, "aboo");
//		mp.put(11362, "bob");
//		mp.put(11363, "cat");
//		mp.put(11371, "frank");
//		mp.put(11372, "jenny");
//		mp.put(11373, "lilly");
//		mp.put(11374, "emmy");
//		
//		Set<Entry<Integer, String>> entrySet = mp.entrySet();
//		for(Entry<Integer, String> result : entrySet) {
//			System.out.println(result);
//		}
		
	}

}
