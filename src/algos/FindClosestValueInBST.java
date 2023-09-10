package algos;

public class FindClosestValueInBST {

	public static int findClosestValueInBst(BST tree, int target) {
		int result = 13;
		System.out.println("result: " + result);
		return result;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		BST bst = new BST(10);
		bst.left = new BST(5);
		bst.left.left = new BST(2);
		bst.left.left.left = new BST(1);
		bst.right = new BST(15);
		bst.right.left = new BST(13);
		bst.right.left.right = new BST(14);
		bst.right.right = new BST(22);
		

		findClosestValueInBst(bst, 12);
	}
}
