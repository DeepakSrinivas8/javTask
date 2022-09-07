package com.javaTask;


public class FourthQuestion {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.print(n1+", "+n2);
		int nextNumb=n1+n2;
		while (nextNumb<100) {
			System.out.print(", "+nextNumb);
			n1=n2;
			n2=nextNumb;
			nextNumb=n1+n2;
		}
	}
}
