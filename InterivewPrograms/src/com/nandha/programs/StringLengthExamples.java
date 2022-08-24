package com.nandha.programs;

public class StringLengthExamples {

	public static void main(String[] args) {
		
		String name="Nandhakumar";
		
		System.out.println(name.length());
		
		int lenght=0;
		
		char [] charArray=name.toCharArray();
		
		
		for (char c : charArray) {
			
			lenght++;
			
		}
		
		System.out.println(lenght);
	}

}
