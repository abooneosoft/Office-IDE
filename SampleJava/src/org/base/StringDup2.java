package org.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDup2 {

	public static void main(String[] args) {
		String s = "abbbbbbbbbccc";
		String emp="";
		int countA =0;
		int countB =0;
		int countC =0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a') {
				countA++;
			}else if (s.charAt(i)=='b') {
				countB++;
			}else if (s.charAt(i)=='c') {
				countC++;
			}
			
			}
		System.out.println("a"+countA);
		System.out.println("b"+countB);
		System.out.println("c"+countC);
		
		char[] charArray2 = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap();
		
		for (char ch : charArray2) {
			if (map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
			
			for(Entry<Character, Integer> entrySet : map.entrySet()) {
				System.out.println(entrySet.getKey()+"    "+entrySet.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] charArray = s.toCharArray();
		for(char c : charArray) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> mapValue : mp.entrySet()) {
			System.out.println(mapValue.getKey()+""+mapValue.getValue());
		}
	
		}
	
	}

