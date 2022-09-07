package com.javaTask2;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String data");
		String s1=s.nextLine();
		int count=0;
		for (int i=0;i<(s1.length());i++) {
			if (((s1.charAt(i)=='t')|(s1.charAt(i)=='T')) && s1.charAt(i+1)=='h' && s1.charAt(i+2)=='e') {
				count+=1;
			}
		}
		System.out.println(count);

	}

}
