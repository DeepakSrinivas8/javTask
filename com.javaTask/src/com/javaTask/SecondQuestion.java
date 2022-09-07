package com.javaTask;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		System.out.println("Enter the four Digits");
		Scanner s1=new Scanner(System.in);
		int n1=s1.nextInt();
		int n2=s1.nextInt();
		int n3=s1.nextInt();
		int n4=s1.nextInt();
		
		if (n1<n2 && n1<n3 && n1<n4) {
			System.out.println(n1 + " is the smallest");
		}
		else if (n2<n1 && n2<n3 && n2<n4) {
			System.out.println(n2 + " is the smallest");
		}
		else if (n3<n1 && n3<n2 && n3<n4) {
			System.out.println(n3 + " is the smallest");
		}
		else {
			System.out.println(n4 + " is the smallest");
		}
	}

}
