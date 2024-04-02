package org.base;
import static java.lang.System.out;


public class Rough {

	public static void main(String[] args) {
 
		int[] num = {2,3,6,7};
		int sum= 0;
		int max= num[0];
		int min=num[0];
		for(int iter : num) {
			sum = sum + iter;
			if (iter>max) {
				max=iter;
			}
			if(iter<min) {
				min=iter;
			}
		}
		int average = sum/num.length;
	           out.println(sum);
		 out.println(max);
		out.println(min);
		out.println(average);
		
		
	}
}