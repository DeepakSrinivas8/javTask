package com.javaTask2;

import java.util.Scanner;

public class SecondQuestion {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String data");
		String s1=s.nextLine();
		String s2=new String();
		int count=0;
		for (int i=0;i<(s1.length());i++) {
			char a=s1.charAt(i);
			if (s1.charAt(i)==' ') {
				if(s1.charAt(i-1)==' ') {
					continue;
				}
				else {
					a=' ';
					s2=s2+a;
				}
			}
			else {
				s2=s2+a;
			}
			
		}
		System.out.println(s2);
		}

}
