package com.javaTask;

import java.util.Scanner;

public class SixthQuestion {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		int rem=0,reverse=0;
		while(n1>0) {
			rem=n1%10;
			reverse=reverse*10+rem;
			n1=n1/10;
		}
		
		System.out.println(reverse);
	}
}
