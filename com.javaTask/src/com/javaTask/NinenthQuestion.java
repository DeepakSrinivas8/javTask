package com.javaTask;

import java.util.ArrayList;
import java.util.Scanner;

public class NinenthQuestion {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s1.nextInt();
		ArrayList a = new ArrayList();
		for (int i=1;i<(n1*10);i++) {
			int b=0;
			for (int j=1;j<i;j++) {
				if (i%j==0) {
					b+=1;
				}
			}
			if (b==1) {
				a.add(i);
			}
		}
		
		System.out.println(a.get(n1-1));

	}

}
