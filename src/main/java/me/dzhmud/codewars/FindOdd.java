package me.dzhmud.codewars;

import java.util.Arrays;

/**
 *
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 *
 */
public class FindOdd {
	public static int findIt(int[] A) {
//		int result = 0;
//		for (int a : A)
//			result ^= a;
//		return result;
		return Arrays.stream(A).parallel().reduce(0, (x,y) -> x^y);
	}
}
