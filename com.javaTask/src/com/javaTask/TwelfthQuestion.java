package com.javaTask;

import java.util.Scanner;

public class TwelfthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		int rem=0,reverse=0,count=0;
		while(n1>0) {
			rem=n1%10;
			reverse=reverse*10+rem;
			n1=n1/10;
			count=count+1;
		}
		System.out.println(count);
	}
}
