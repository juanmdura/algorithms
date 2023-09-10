package algos;

public class RemoveDuplicatesFromLinkedList {

	public static class LinkedList{
		public int value;
		public LinkedList next;

		public LinkedList (int value) {
			this.value = value;
			this.next = null;
		}
	}

	public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		LinkedList currentNode = linkedList;
		while(currentNode != null) {
			LinkedList nextDistinctNode = currentNode.next;
			while (nextDistinctNode != null &&
					nextDistinctNode.value == currentNode.value) {
				nextDistinctNode = nextDistinctNode.next;
			}
			currentNode.next = nextDistinctNode;
			currentNode = nextDistinctNode;
		}
		return linkedList;
	}

	public static void main(String[] args) {
		// 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 
		LinkedList ll = new LinkedList(1);
		ll.next = new LinkedList(1);
		ll.next.next = new LinkedList(3);
		ll.next.next.next = new LinkedList(4);
		ll.next.next.next.next = new LinkedList(4);
		ll.next.next.next.next.next = new LinkedList(4);
		ll.next.next.next.next.next.next = new LinkedList(5);
		ll.next.next.next.next.next.next.next = new LinkedList(6);
		ll.next.next.next.next.next.next.next.next = new LinkedList(6);
		
		removeDuplicatesFromLinkedList(ll);
		System.out.println("end");
	}
}
