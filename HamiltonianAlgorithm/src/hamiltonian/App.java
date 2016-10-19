package hamiltonian;

public class App 
{
	public static void main(String[] args) {
		
		HamiltonianAlgorithm hamiltonian=new HamiltonianAlgorithm();
		
					/* (1)------------(2)
						|			   |
						|			   |
						|			   |
						|			   |
						|			   |
		|-------(8)----(4)------------(3)
 		|		 |	    |
 		|		 |	    |
		|		(9)	   (5)--------(6)
 		|		 |	    |
 		|		 |	    |
		(11)----(10)   (7)
 		 
 		 
	*/
		
		
		int adjencyMatrix[][]={{0,1,0,1},{1,0,1,0},{0,1,0,1},{1,0,1,0}};
				
			hamiltonian.hamiltonianCycle(adjencyMatrix);	
		}
	}

