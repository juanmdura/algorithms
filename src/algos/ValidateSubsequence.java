package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arrayIdx=0;
		int sequenceIdx=0;
		
		while (arrayIdx < array.size() && sequenceIdx < sequence.size()) {
			if (array.get(arrayIdx).equals(sequence.get(sequenceIdx))) {
				sequenceIdx++;
			}
			arrayIdx++;
		}
		return sequenceIdx == sequence.size();
	}

	public static void main(String[] args) {
		 List<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		 List<Integer> sequence = new ArrayList<Integer>(Arrays.asList(1,3,4));
		 
		 System.out.println("isValidSubsequence: " + ValidateSubsequence.isValidSubsequence(array, sequence));
	}

}
