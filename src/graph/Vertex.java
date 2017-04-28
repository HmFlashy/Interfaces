

public class Vertex {

	private int x;
	private int y;	
	private Object obj

	public Vertex(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Object getObject(){
		return this.obj;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public Object setObject(Object obj){
		this.obj = obj;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}
}