package com.javaTask;

import java.util.Scanner;

public class FourteenthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		int rem=0;
		boolean a=false;
		if (n1<0) {
			a=false;
		}
		else {
			while(n1>0) {
				rem=n1%10;
				n1=n1/10;
				if (rem==0 | rem==1) {
					a=true;
				}
				else {
					a=false;
					break;
				}
			}
		}
		
		
		System.out.println(a);

	}

}
