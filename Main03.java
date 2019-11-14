package com.สิฬโ;
//1+2+4+5+6+...
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long x;
		x=a*(a+1)/2;
		System.out.println(x);
	}

}
