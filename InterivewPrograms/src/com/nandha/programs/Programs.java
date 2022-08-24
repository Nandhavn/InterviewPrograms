package com.nandha.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Programs{

	public void ReverseAString() {


		String names="Nandhakumar";


		String rev="";

		for(int i=names.length()-1;i>=0;i--) {

			rev=rev+names.charAt(i);
		}

		System.out.println(rev);
		
		StringBuffer buffer=new StringBuffer();
		
		buffer.append(names);
		
		System.out.println(buffer.reverse());
		
		System.out.println("---------------------------");
		
		char [] charArray=names.toCharArray();
		
		
		List<Character> list=new ArrayList<Character>();
		
		
		for (Character character : charArray) {
			
			list.add(character);
			
		}
		
		Collections.reverse(list);
		 
		Iterator<Character> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next());
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Programs programs=new Programs();

		programs.ReverseAString();

	}

}
