interface Graph {
	void addVertex(Vertex v);
	void addUndirected(Vertex v1, Vertex v2);
	void removeVertex(Vertex v);
	void removeEdge(Edge e);
	void addEdge(Edge e);
}