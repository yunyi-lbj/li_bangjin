package com.试题02;
//特殊回文数
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 10000; i <= 999999; i++) {
			if(back(i,a))
				System.out.println(i);
		}
	}
	public static boolean back(int a,int n) {
		Integer b = a;
		String s = b.toString();
		String d = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			d += s.charAt(i);
		}
		if(! d.equals(" " +s))
		return false;
		else
		{
			int sum=0;
			for (int i = 0; i < s.length(); i++) {
				sum+=s.charAt(i) - '0';
			}
			if(sum != n)
				return false;
			else
			return true;
		}
	}
}
