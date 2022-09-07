package com.javaTask;

import java.util.Scanner;

public class SixteenthQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Salary");
		int s1=s.nextInt();
		int totalTax=0;
		if (s1<=250000) {
			totalTax=0;
		}
		else if ((s1>250000) && (s1<=500000)) {
			totalTax=(s1-250000)*5/100;
			System.out.println("Total Tax to be paid = "+totalTax);
			
		}
		else if ((s1>500000) && (s1<=1000000)) {
			totalTax=((250000*5)/100) + (((s1-500000)*10)/100);
			System.out.println("Total Tax to be paid = "+totalTax);
		}
		else if (s1>1000000) {
			totalTax=((250000*5)/100) + ((500000*10)/100) + (((s1-1000000)*20)/100);
			System.out.println("Total Tax to be paid = "+totalTax);
		}
	}
}
