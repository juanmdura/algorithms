package algos;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		int swaps = swap(array);

		while (swaps > 0) {
			swaps = swap(array);
		}
		return array;
	}

	private static int swap(int[] array) {
		int swaps = 0;
		for (int i = 0; i < array.length-1; i++) {
			int current = array[i];
			int next = array[i+1];
			if (current > next) {
				array[i] = next;
				array[i+1] = current;
				swaps++;
			} 
		}
		return swaps;
	}

	public static void main(String[] args) {
		//{2, 3, 5, 5, 6, 8, 9};

		int[] input = {8, 5, 2, 9, 5, 6, 3};
		int[] result = bubbleSort(input);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}	
