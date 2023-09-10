package algos;

public class AdjacencyMatrix {

	static int[][] matrix; // Adjacency matrix
	static int numVertices; // Number of vertices

	public static void main(String[] args) {
		// Set the number of of vertices or nodes: A, B, C and D
		numVertices = 4;

		// Initialize the adjacency matrix
		matrix = new int[numVertices][numVertices];

		// Add some edges
		matrix[0][1] = 1; 
		matrix[1][2] = 1;
		matrix[2][3] = 1;

		 // Make the matrix symmetrical
	    for (int i = 0; i < numVertices; i++) {
	      for (int j = 0; j < i; j++) {
	        matrix[i][j] = matrix[j][i];
	      }
	    }
	    
		// Print the adjacency matrix header
		System.out.print("  ");
		for (int i = 0; i < numVertices; i++) {
			System.out.print((char)('A' + i) + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numVertices; i++) {
			System.out.print((char)('A' + i) + " ");
			
			for (int j = 0; j < numVertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}

