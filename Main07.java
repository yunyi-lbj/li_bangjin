package com.试题02;
//回文数
public class Main03 {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if(back(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean back(int a) {
		Integer b = a;
		String s = b.toString();
		String d = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			d += s.charAt(i);
		}
		if(! d.equals(" " +s))
			return false;
		else
			return true;
		}
}
