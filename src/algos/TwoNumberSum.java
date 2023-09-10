package algos;

public class TwoNumberSum {

	public static int[] twoNumberSum(int[] array, int targetSum) {
		for (int i=0 ; i < array.length; i++){
			int candidateA = array[i];
			int position = 0;
			while (position < array.length){
				int candidateB = array[position];
				if (candidateA != candidateB &&
						candidateA + candidateB == targetSum){
					System.out.println("candidateA: " + candidateA + " - candidateB: " + candidateB);
					return new int[] {candidateA, candidateB};
				}
				position++;
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int[] input = {3, 6, 4, 8, 11, 1, -1, 6};
		TwoNumberSum.twoNumberSum(input, 10);
	}
}
