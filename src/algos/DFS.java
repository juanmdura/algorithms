package algos;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> depthFirstSearch(List<String> array) {
			array.add(name);
			for (Node child : children) {
				child.depthFirstSearch(array);
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
		result = graph.depthFirstSearch(result);
		//["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]

	    for (String name : result) {
			System.out.print(" " + name);			
		}
	}
}
