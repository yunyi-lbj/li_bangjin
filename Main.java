package com.试题;
//圆的面积
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
			double PI = java.lang.Math.atan(1.0)*4;
			Scanner s = new Scanner(System.in);
			int r = s.nextInt();
			double area = PI*java.lang.Math.pow(r,2);
			DecimalFormat d = new DecimalFormat("#.0000000");
			
			System.out.println(d.format(area));
	}
}