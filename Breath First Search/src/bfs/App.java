package bfs;

public class App 
{
	public static void main(String[] args) {
		BFS bfs=new BFS();
		
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		Vertex v6=new Vertex(6);
		Vertex v7=new Vertex(7);
		
		v1.addNeighbours(v2);
		v1.addNeighbours(v3);
		v2.addNeighbours(v1);
		
		bfs.bfs(v1);
		
	}

	
	
	
}
