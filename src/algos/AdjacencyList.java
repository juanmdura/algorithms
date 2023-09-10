package algos;
import java.util.List;
import java.util.ArrayList;

//https://www.algotree.org/algorithms/adjacency_list/graph_as_adjacency_list_java/
public class AdjacencyList {
	int nodes;
	List<List<Integer>> adjlist;

	AdjacencyList(int arg_nodes) {
		nodes = arg_nodes;
		adjlist = new ArrayList<>(nodes);
		for (int i=0; i<nodes; i++)
			adjlist.add(new ArrayList<>());
	}

	void AddEdge (int src, int dst) {
		adjlist.get(src).add(dst);
		adjlist.get(dst).add(src);
	}

	void Iterate (int src) {
		System.out.print("\n" + src + " : ");
		for(Integer adj_node : adjlist.get(src)) {
			System.out.print(adj_node + " ");
		}
	}

	public static void main (String[] args) {

		AdjacencyList g = new AdjacencyList(7);
		g.AddEdge(0,1);
		g.AddEdge(0,2);
		g.AddEdge(1,3);
		g.AddEdge(1,4);
		g.AddEdge(2,3);
		g.AddEdge(3,5);
		g.AddEdge(4,6);
		g.AddEdge(5,6);

		System.out.print("Adjacency list implementation for graph");

		g.Iterate (0);
		g.Iterate (1);
		g.Iterate (2);
		g.Iterate (3);
		g.Iterate (4);
		g.Iterate (5);
	}
}


