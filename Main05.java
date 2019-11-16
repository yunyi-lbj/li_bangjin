package com.试题;
//十六进制转十进制
import java.security.Policy.Parameters;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String[] b = new String[a];
		for (int i = 0; i < a; i++) {
			b[i] = s.next();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(Long.toOctalString((Long.valueOf(b[i],16))));			
		}
	}

}
