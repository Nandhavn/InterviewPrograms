package com.nandha.programs;

public class ArrayContainsElementPresentOrNot {

	public static void main(String[] args) {
		
		
		int [] array= {10,45,56,12,78};
		
		int toFoundNumber=12;
		
		boolean found=false;
		
		for (int number : array) {
			
			if(number==toFoundNumber) {
				
				found=true;
				
				break;
			}
		}
         
		if(found) {
			
			System.out.println("Number is Present");
		}else {
			
			System.out.println("Number Not Present");
		}
	}

}
