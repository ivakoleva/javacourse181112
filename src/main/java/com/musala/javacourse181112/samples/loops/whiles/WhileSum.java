package com.musala.javacourse181112.samples.loops.whiles;

class WhileSum {
	public static void main(String[] args) {

		int sum = 0, i = 100;

		while (i != 0) {
			sum += i;     // sum = sum + i;
			--i;
		}

		System.out.println("WhileSum = " + sum);
	}
}