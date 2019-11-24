package com.试题02;
//水仙花数 153=1*1*1+5*5*5+3*3*3
public class Main04 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			if(back(i))
				System.out.println(i);
		}
	}
	public static boolean back(int a) {
		Integer b = a;
		String s = b.toString();
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			sum += java.lang.Math.pow(s.charAt(i)-'0',3);
		}
		if(sum == a)
			return true;
		else
			return false;
	}
}
