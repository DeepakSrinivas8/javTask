package com.javaTask;

public class EleventhQuestion {

	public static void main(String[] args) {
		int n1=100;
		for (int i=1;i<(n1*10);i++) {
			int b=0;
			for (int j=1;j<i;j++) {
				if (i%j==0) {
					b+=1;
				}
			}
			if (b==1) {
				if (i<100) {
					System.out.print(i+", ");
				}
			}
		}

	}

}
