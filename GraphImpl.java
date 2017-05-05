import graph.*;

public class GraphImpl implements Graph{
	public Vertex[] tabVertex;
	public Edge[] tabEdge;
	public String type;

	/**
	* Create a graph using the interface Graph
	*/
	public GraphImpl(Vertex[] tabVertex, Edge[] tabEdge,String type){
		this.tabVertex=tabVertex;
		this.tabEdge=tabEdge;
		this.type=type;
	}

	/**
	* Add a vertex to the graph
	* @param a an int coresponding to the number of the vertex
	*/
	public void addVertex(int a){
		Vertex v = new Vertex(a);
		Vertex[] tabVertexNew = new Vertex[this.tabVertex.length+1];
		for(int i=0; i<this.tabVertex.length ; i++){
			tabVertexNew[i]=this.tabVertex[i];
		}
		tabVertexNew[tabVertexNew.length-1]=v;
		this.tabVertex=tabVertexNew;
	}

	/**
	* Remove a vertex to the graph
	* @param v the vertex to remove from the graph
	*/
	public void rmvVertex(Vertex v){
		Vertex[] tabVertexNew = new Vertex[this.tabVertex.length-1];
		int j=0;
		for(int i=0; i<this.tabVertex.length ; i++){
			if(!this.tabVertex[i].equals(v)){
				tabVertexNew[j]=this.tabVertex[i];
				j+=1;
			}
		}
		this.tabVertex=tabVertexNew;
	}

	/**
	* Add an Edge to the graph
	* @param x the first vertex of the edge
	* @param y the second vertex of the edge
	*/
	public void addEdge(Vertex x, Vertex y){
		Edge v;
		if(this.type.equals("undirected")){
			v = new UndirectedEdge(x,y,this);
		}
		else{
			v = new DirectedEdge(x,y,this);
		}
		Edge[] tabEdgeNew = new Edge[this.tabEdge.length+1];
		for(int i=0; i<this.tabEdge.length ; i++){
			tabEdgeNew[i]=this.tabEdge[i];
		}
		tabEdgeNew[tabEdgeNew.length-1]=v;
		this.tabEdge=tabEdgeNew;
	}

	/**
	* Remove an Edge to the graph
	* @param e the edge to remove from the graph
	*/
	public void rmvEdge(Edge e){
		int j=0;
		Edge[] tabEdgeNew = new Edge[this.tabEdge.length-1];
		for(int i=0; i<this.tabEdge.length ; i++){
			if(!this.tabEdge[i].equals(e)){
				tabEdgeNew[j]=this.tabEdge[i];
				j+=1;
			}
		}
		this.tabEdge=tabEdgeNew;
	}
}