package com.javaTask;

import java.util.Scanner;

public class FifthQuestion {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the month");
		int n1=s1.nextInt();
		System.out.println("Enter the year");
		int n2=s1.nextInt();
		
		if (0<n1 && n1<13){
			if (n1==2) {
				if (n2 % 4 == 0) {
					if (n2 % 100 == 0) {
						if (n2 % 400 == 0) {
							System.out.println("29 Days");
						}
						else {
							System.out.println("28 Days");
						}
					}
					else {
						System.out.println("29 Days");
					}
				}
				else {
					System.out.println("28 Days");
				}
			}

			else if ((n1==4) || (n1==6) || (n1==9) || (n1==11)) {
				System.out.println("30 Days");
			}
			
			else {
				System.out.println("31 Days");
			}
		}
		else {
			System.out.println("Please Enter Valid Month");
		}
	}
}
