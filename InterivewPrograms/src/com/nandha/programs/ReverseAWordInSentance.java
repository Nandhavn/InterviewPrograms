package com.nandha.programs;

import java.util.Iterator;

public class ReverseAWordInSentance {

	public static void main(String[] args) {
		
		String word="I Love India";
		
		String reversed="";
		
		
		String[] temp=word.split(" ");
		
		System.out.println(temp.length);
		
		
		for(int i=temp.length-1;i>=0;i--) {
			
			reversed=reversed+temp[i]+" ";
		}
		
		System.out.println(reversed);

	}

}
