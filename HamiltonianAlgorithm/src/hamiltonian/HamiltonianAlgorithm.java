package hamiltonian;

public class HamiltonianAlgorithm 
{
	
	private int numOfVertex;
	private int hamiltonianPath[];
	private int adjencyMatrix[][];
	
	public void hamiltonianCycle(int adjencyMatrix[][]) 
	{
		this.numOfVertex=adjencyMatrix[0].length;
		this.hamiltonianPath=new int[this.numOfVertex];
		this.adjencyMatrix=adjencyMatrix;
		
		this.hamiltonianPath[0]=0;
		
		if(!findFeasibleSolution(1))
		{
			System.out.println("no any feasible solution found....");
			return;
		}
		
		showHamiltonianPath();
	}
	
	
	boolean findFeasibleSolution(int position)
	{
		if(position==this.numOfVertex)
		{
			if(this.adjencyMatrix[this.hamiltonianPath[position-1]][this.hamiltonianPath[0]]==1)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
		
		for(int vertexIndex=1;vertexIndex<this.numOfVertex;++vertexIndex)
		{
			if(isFeasible(vertexIndex,position))
			{
				this.hamiltonianPath[position]=vertexIndex;
				
				if(findFeasibleSolution(position+1))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	boolean isFeasible(int vertex,int actualPosition)
	{
		if(adjencyMatrix[this.hamiltonianPath[actualPosition-1]][vertex]==0)
		{
			return false;
		}
		
		for (int i = 0; i < actualPosition; ++i) 
		{
			if(hamiltonianPath[i]==vertex)
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	
	
	public void showHamiltonianPath()
	{
		System.out.println("Hamiltonian Path exist");
		
		for (int i = 0; i < numOfVertex; ++i) 
		{
			System.out.print(this.hamiltonianPath[i]+"-->");
		}
		
		System.out.println(this.hamiltonianPath[0]);
	}
}
