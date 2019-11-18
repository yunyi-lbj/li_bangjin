package com.试题02;
//十进制转十六进制
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int str = s.nextInt();
		String d = null;
		String q = Long.toHexString(str);
		for (int i = 0; i < q.length(); i++) {
			if(q.charAt(i) >= '0' && q.charAt(i) <= '9' )
			{
				d = q.replace(q.charAt(i), q.charAt(i));
				
			}
			else
			{
				int m = q.charAt(i)-32;
				char w =(char)m;
				d = q.replace(q.charAt(i), w);
			}
		}
			System.out.println(d);
	}
}
