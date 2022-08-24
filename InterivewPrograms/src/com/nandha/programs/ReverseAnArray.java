package com.nandha.programs;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		int [] array= {1,3,4,6,7,9};
		
		int arraySize=array.length;
		
		System.out.println("Original Array " + array);
		
		
		for(int i=arraySize-1;i>=0;i--) {
			
			System.out.print(array[i]);
				
		}

	}

}
