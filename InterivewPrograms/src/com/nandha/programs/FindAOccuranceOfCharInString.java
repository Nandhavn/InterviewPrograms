package com.nandha.programs;

public class FindAOccuranceOfCharInString {

	public static void main(String[] args) {
		
		String name="Nandhakumar";
		
		String ucase=name.toLowerCase();
		
		char toFind='a';
		
		int Occurance=0;
		
		for(int i=0;i<ucase.length();i++) {
			
			if(name.charAt(i)==toFind)
				
				Occurance++;		
		}
		
		System.out.println(Occurance);
	}

}
