package algos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> breadthFirstSearch(List<String> array) {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(this);
			while (!queue.isEmpty()) {
				Node current = queue.poll();
				array.add(current.name);
				queue.addAll(current.children);
			}
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}
	}

	public static void main(String[] args) {
		Node graph = new Node("A");
	    graph.addChild("B").addChild("C").addChild("D");
	    graph.children.get(0).addChild("E").addChild("F");
	    graph.children.get(2).addChild("G").addChild("H");
	    graph.children.get(0).children.get(1).addChild("I").addChild("J");
	    graph.children.get(2).children.get(0).addChild("K");
	    
	    List<String> result = new ArrayList<String>();
		result = graph.breadthFirstSearch(result);
		//["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"]

	    for (String name : result) {
			System.out.print(" " + name);			
		}
	}
}
