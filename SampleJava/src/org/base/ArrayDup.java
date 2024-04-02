package org.base;

public class ArrayDup {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,3,3};
		int dupcount = 0;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" is duplicate");
					dupcount++;
				}

			}
		}
	}
}
