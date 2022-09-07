package com.javaTask;

import java.util.ArrayList;
import java.util.Scanner;

public class TenthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		for (int i=1;i<(n1*10);i++) {
			int b=0;
			for (int j=1;j<i;j++) {
				if (i%j==0) {
					b+=1;
				}
			}
			if (b==1) {
				a1.add(i);
			}
		  }
		for (int k=0;k<n1;k++) {
			a2.add(a1.get(k));
		}
		
		System.out.println("First " + n1 + " primes are "+a2);
	}

}
