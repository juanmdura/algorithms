package algos;

import java.util.Arrays;

public class SortedSquaredArray {

	public static int[] sortedSquaredArray(int[] array) {
		int[] result = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			int square = array[i]*array[i];
			System.out.println("square: " + square);
			result[i]=square;
		}
		Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		SortedSquaredArray.sortedSquaredArray(new int[] {1, 2, 3, 5, 6, 8, 9});
	}
}
