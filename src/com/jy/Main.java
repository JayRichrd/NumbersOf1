package com.jy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 获取输入
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个整数n:");
		int n = scanner.nextInt();

		System.out.println("用二进制表示" + n + "时，当中1的个数为:" + numbersOf1A(n));
		System.out.println("用二进制表示" + n + "时，当中1的个数为:" + numbersOf1B(n));
		// 释放资源
		scanner.close();
	}

	/**
	 * 将数字用二进制表示后，返回当中1的个数
	 * 
	 * @param number
	 *            输入的数
	 * @return 1的个数
	 */
	private static int numbersOf1A(int number) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((number & flag) != 0)
				count++;
			flag <<= 1;
		}
		return count;
	}

	/**
	 * 将数字用二进制表示后，返回当中1的个数
	 * 
	 * @param number
	 *            输入的数
	 * @return 1的个数
	 */
	private static int numbersOf1B(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number & (number - 1);
		}
		return count;
	}

}
