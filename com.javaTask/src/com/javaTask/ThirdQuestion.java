package com.javaTask;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner s1=new Scanner(System.in);
		int n1=s1.nextInt();
		if (n1%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
