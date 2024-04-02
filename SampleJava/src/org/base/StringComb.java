package org.base;

public class StringComb {

	public static void main(String[] args) {
        String input = "abc";
        String empty ="";
        generateCombinations(empty, input);
    }

    public static void generateCombinations(String prefix, String input) {
        int n = input.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
            	generateCombinations(prefix+input.charAt(i), input.substring(0,i)+input.substring(i+1,n));
               // generateCombinations(prefix + input.charAt(i), input.substring(0, i) + input.substring(i + 1, n));
            }
        }
    }
}
