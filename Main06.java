package com.试题;
//十六进制转十进制
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String a = s.next();
			System.out.println(Long.parseLong(a, 16));
	}

}
