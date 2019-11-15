package com.ÊÔÌâ;
//Êı×éÅÅĞò
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			list.add(s.nextInt());
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
