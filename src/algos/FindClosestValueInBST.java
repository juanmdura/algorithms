package algos;

public class FindClosestValueInBST {

	public static int findClosestValueInBst(BST tree, int target) {
		int result = findClosestValueInBstHelper(tree, target, tree.value);
		System.out.println("result: " + result);
		return result;
	}

	private static int findClosestValueInBstHelper(BST tree, int target, int closest) {
		if (tree == null) {
			return closest;
		}

		int diffWithClosest = Math.abs(target - closest);
		int diffWithCurrent = Math.abs(target - tree.value);
		
		if ( diffWithCurrent < diffWithClosest) {
			closest = tree.value;
		}

		if (target < tree.value) {
			return findClosestValueInBstHelper(tree.left, target, closest);

		} else if (target > tree.value) {
			return findClosestValueInBstHelper(tree.right, target, closest);
			
		} else {
			return closest;
		}			
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

		var root = new BST(10);
		root.left = new BST(5);
		root.left.left = new BST(2);
		root.left.left.left = new BST(1);
		root.left.right = new BST(5);
		root.right = new BST(15);
		root.right.left = new BST(13);
		root.right.left.right = new BST(14);
		root.right.right = new BST(22);

		//expected = 13
		findClosestValueInBst(root, 20);		
	}
}
