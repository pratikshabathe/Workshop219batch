package com.blz.workshop;

import java.util.Scanner;

public class EvenOddNumbers {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("it is Even number");
		}else {
			System.out.println("it is add number");
		}
	}
}
