package algos;
import java.util.*;

public class DoubleEndedQueue {

	public static void main(String[] args) {
		int n = 6;
		int m = 3;

		int num = 535232;
		int maxUnique = 0;
		for (int i = 0; i < n; i++) {
			try {
				int subArray = Integer.valueOf((""+num).substring(i, m+i));
				System.out.println(subArray);
				
				ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();
				for (int j = 0; j < m; j++) {
					int value = Integer.valueOf((subArray+"").substring(j, j+1));
					if (!uniqueNumbers.contains(value)) {
						uniqueNumbers.add(value);
					}
				}
				
				if (uniqueNumbers.size() > maxUnique) {
					maxUnique = uniqueNumbers.size();
				}
				
				System.out.println("Uniques of " + i + " - " + uniqueNumbers.size());
				
			}catch(Exception e){
				System.out.println("Fin iteracion");
				break;
			}
		}
		System.out.println("Max: " + maxUnique);
	}
}




