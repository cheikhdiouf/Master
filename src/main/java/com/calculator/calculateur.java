package com.calculator;

public class calculateur {

	public static int Sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;

	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static int multiply(int a, int b) {
		return (a * b);
	}

	public static int min(int a, int b) {
		return Math.min(a, b);
	}

	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public int maxElement(int[] list) {
		int index;
		int max =0;
		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}

		}
		return max;
	}

	public int minElement(int[] list) {
		int index = Integer.MIN_VALUE;
		int min = 0;
		for (index = 0; index < list.length; index++) {
			if (list[index] < min) {
				min = list[index];
			}

		}
		return min;
	}

}
