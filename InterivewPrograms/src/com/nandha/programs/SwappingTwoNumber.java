package com.nandha.programs;

public class SwappingTwoNumber {



	public void swapWithThirdVariable() {


		int Lead=50000;

		int Manager=100000;

		int temp=0;

		System.out.println("Before Swapping Lead  " + Lead + " Manager " + Manager  );

		temp=50000;

		Lead=Manager;

		Manager=temp;

		System.out.println("After Swapping Lead  " + Lead + " Manager " + Manager  );
	}

	public void swapWithoutThirdVaraible() {

		int Lead=50000;

		int Manager=100000;

		System.out.println("Before Swapping Lead  " + Lead + " Manager " + Manager  );

		Manager=Manager-Lead;
		
		Lead=Manager+Lead;

	
		System.out.println("After Swapping Lead  " + Lead + " Manager " + Manager  );
		
	}

	public static void main(String [] args) {

		SwappingTwoNumber number=new SwappingTwoNumber();


		number.swapWithThirdVariable();
		
		number.swapWithoutThirdVaraible();

	}

}
