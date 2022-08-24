package com.nandha.programs;

public class ReverseANumber {
	
	
	public void method1() {
		
		
		int givennumber=1245789;
		
		int reversedNumber=0;
		
		while(givennumber!=0) {
			
			reversedNumber=reversedNumber*10;
			
			reversedNumber=reversedNumber+givennumber%10;
			
			givennumber=givennumber/10;
		}
		
		System.out.println(reversedNumber);
		
	}
	
	
public static void main(String[] args) {
	
	
	ReverseANumber aNumber=new ReverseANumber();
	
	aNumber.method1();
		
	}

}
