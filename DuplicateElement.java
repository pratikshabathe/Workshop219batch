package com.blz.workshop;


public class DuplicateElement {
	
	public static void main(String[] args) {


		int arr[] = {4, 1, 2, 3, 4,};
		
		System.out.println("Odd Number Are:");
		
		for(int i = 0; i<arr.length;i++) {
		if(arr[i]%2 != 0) {
			System.out.println(arr[i] + " ");
		}
		}
		
		System.out.println("Even number are:");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i] + " ");
			}
			}
		
		//System.out.println("Duplicate Element are");
		
		//for(int i = 0; i <= arr.length;i++ ) {
		//	for(int j = i; j <arr.length; i++) {
		//		if(arr[i] == arr[j]) {
					
					//System.out.println(arr[j]);
				

			
		}
}
