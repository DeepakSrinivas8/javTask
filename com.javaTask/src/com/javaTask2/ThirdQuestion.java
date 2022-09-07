package com.javaTask2;

import java.util.Scanner;

public class ThirdQuestion {
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n1=s1.nextInt();
		System.out.println("Enter the range to be printed");
		int n2=s1.nextInt();
		int n3=s1.nextInt();
		int[] a1 = new int[n1+1];
		int[] a2 = new int[n1];
		if (n1>n2 && n1>n3 && n2<n3) {
			for (int i=0;i<=n1;i++) {
				
				a1[i]=i;
			}
			for(int j=0;j<n1;j++) {
				if (a1[j]>=n2 && a1[j]<=n3) {
					a2[j-20]=a1[j];
					System.out.print(a2[j-n2]+", ");
				}
			}
		}
		else {
			System.out.println("Please enter a valid range");
		}
		
		
	}

}
