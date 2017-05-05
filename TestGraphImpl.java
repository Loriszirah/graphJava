import graph.*;

public class TestGraphImpl{
	public static void main(String[] args){
		Vertex a = new Vertex(1);
		Vertex b = new Vertex(2);
		Vertex c = new Vertex(3);
		Vertex[] tabVertexNew = {a,b,c};

		Edge[] tabEdgeNew = new Edge[0];
		GraphImpl G = new GraphImpl(tabVertexNew, tabEdgeNew, "Undirected");
		G.addEdge(a,b);
		G.addEdge(b,c);
		G.rmvEdge(G.tabEdge[0]);
		G.addEdge(a,b);
		G.rmvVertex(a);
		G.addVertex(1);
		for(int i=0; i<G.tabVertex.length;i++){
			System.out.println("Vertex : "+G.tabVertex[i].getName());
		}
		for(int i=0; i<G.tabEdge.length;i++){
			System.out.println("Edge : ("+G.tabEdge[i].getVertexA().getName()+","+G.tabEdge[i].getVertexB().getName()+")");
		}
	}
}