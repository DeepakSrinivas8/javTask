package com.javaTask2;

import java.util.Scanner;

public class FourthQuestion {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n1=s.nextInt();
		System.out.println("Enter the array data");
		int[] a1=new int[n1];
		for (int i=0;i<n1;i++) {
			int e = s.nextInt();
			a1[i]=e;
		}
		for (int j=0;j<n1;j++){
			int count=0;
			for (int k : a1){
				if (a1[j]==k) {
					count+=1;
				}
			}
			if (count>1) {
				a1[j]=-1;
			}	
		}
		for (int l : a1) {
			if (l!=-1) {
				System.out.print(l+", ");
			}
		}	
	}
}
