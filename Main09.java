package com.试题02;
//求指定数在数组中的位置
import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		int m = s.nextInt();
		int i;
		for (i = 0; i < nums.length; i++) {
			if(nums[i] == m)
				break;
		}
		if(i == nums.length)
			System.out.println(-1);
		else
			System.out.println(i+1);
	}
}
