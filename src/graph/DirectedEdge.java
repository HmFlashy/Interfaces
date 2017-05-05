package graph;
/**
* The class that define a directed edge
*/
class DirectedEdge extends Edge {
	
	private boolean direction;

	/**
	* Contructor for the DirectedEdge class
	*
	* @param v1 first vertex
	* @param v2 second vertex
	* @param direction Direction of the Edge, if true: v1 -> v2; if false: v2 -> v1
	*/
	public DirectedEdge(Vertex v1, Vertex v2, boolean direction){
		super(v1, v2);
		this.direction = direction;
	}
}