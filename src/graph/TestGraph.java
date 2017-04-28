public class TestGraph implements Graph {
	
	Vertex[] vs;
	Edge[] ed;

	public static void main(String[] args) {
		vs.add(new Vertex(1,1));
		vs.add(new Vertex(2,2));
		ed.add(new UndirectedEdge(vs[0], vs[1]));
		System.out.println("It's ok!");
	}
}