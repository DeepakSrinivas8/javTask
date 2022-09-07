package com.javaTask;

import java.util.Scanner;

public class FifteenthQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int s1=s.nextInt();
		int s2=s.nextInt();
		int s3=s.nextInt();
		int s4=s.nextInt();
		int s5=s.nextInt();
		int s6=s.nextInt();
		int total,percentage;
		
		if ((s1<0)||(s1>100) || (s2<0)||(s2>100) || (s3<0)||(s3>100) || (s4<0)||(s4>100) || (s5<0)||(s5>100) || (s6<0)||(s6>100)) {
			System.out.println("Please Enetr Valid Data");
		}
		
		else if((s1<35) || (s2<35) || (s3<35) || (s4<35) || (s5<35) || (s6<35)) {
			System.out.println("Failed");
		}
		
		else {
			total=s1+s2+s3+s4+s5+s6;
			percentage=(total*100)/600;
			if (percentage>=60) {
				System.out.println("A Grade");
			}
			else if (percentage<60 && percentage >=50) {
				System.out.println("B Grade");
			}
			else if (percentage<50 && percentage >=35) {
				System.out.println("C Grade");
			}
			
		}

	}

}
