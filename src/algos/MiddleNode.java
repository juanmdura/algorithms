package algos;

public class MiddleNode {

	public static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}
	}

	private static LinkedList middleNode(LinkedList linkedList) {
		int size = 0;
		LinkedList nextNode = linkedList;
		while (nextNode != null) {
			size++;
			nextNode = nextNode.next;
		}
		
		int middle = size/2;
		int count = 0;
		LinkedList result = linkedList;
		while (count < middle) {
			count++;
			result = result.next; 			
		}
		System.out.println("result.value: "+ result.value);
		return result;
	}

	public static void main(String[] args) {		
		// 2 -> 7 -> 6 -> 5 -> 3  
		LinkedList ll = new LinkedList(2);
		ll.next = new LinkedList(7);
		ll.next.next = new LinkedList(6);
		ll.next.next.next = new LinkedList(5);
		//ll.next.next.next.next = new LinkedList(3);
		/*ll.next.next.next.next.next = new LinkedList(5);
		ll.next.next.next.next.next.next = new LinkedList(6);
		ll.next.next.next.next.next.next.next = new LinkedList(7);
		ll.next.next.next.next.next.next.next.next = new LinkedList(8);*/
		
		middleNode(ll);
		System.out.println("end");
	}

}
