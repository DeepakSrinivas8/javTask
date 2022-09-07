package com.javaTask;

import java.util.Scanner;

public class ThirteenthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		double discount;
		int n2;
		
		if (n1<=2000) {
			discount=((5*n1)/100);
			System.out.println("Total discount is "+discount);
			System.out.println("Discounted price is "+ (n1-discount));
		}
		else if (n1>2000) {
			n2=n1-2000;
			discount=(((5*2000)/100)) + (((10*n2)/100));
			System.out.println("Total discount is "+discount);
			System.out.println("Discounted price is "+ (n1-discount));
		}
		
	}
}
