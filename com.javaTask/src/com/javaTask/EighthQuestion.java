package com.javaTask;

import java.util.Scanner;

public class EighthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		int a=0;
		for (int i=1;i<n1;i++) {
			if (n1%i==0) {
				a+=1;
			}		
		}
		if (a>1) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
			

	}

}
