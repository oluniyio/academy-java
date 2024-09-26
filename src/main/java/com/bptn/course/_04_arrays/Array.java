package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
        //Declare and initiate an array with 6 value
		
		int[] myArray = {3,5,7,9,11,13};
		
		//Print the first and second element to the console
		System.out.println("First element: "+ myArray[0]);
		
		System.out.println("Second element: "+ myArray[1]);
		
		//Update the first element to 30
		myArray[0] =30;
		
		System.out.println("Update first element: "+ myArray[0]);
		
		//Update the last element of the array using length property (without the index) and set it to 130
		
		myArray[myArray.length-1] =130;
		
		System.out.println("Update last element: "+ myArray[myArray.length-1]);
		
		// //for- loop to print all the elements of the myArray
		// for (int i=1 ; i<=10 ; i++) {
		//    System.out.println(i);
		// }
		
		  //use for loop to print all the elements of the myArray
		for(int i=0; i<myArray.length;i++); {
			System.out.println(myArray[1]);
			
			for(int i=myArray.length-1 ; i>=0 ; i--) {
				
				System.out.println(myArray[i]);
				
				//Enhance for -loop (for -each loop
				for(int element: myArray) {
					System.out.println(element);
				}
			}
		}
		
			
	}
}
