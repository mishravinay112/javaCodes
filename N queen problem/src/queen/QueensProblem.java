package queen;

public class QueensProblem 
{
	private int queensArray[];
	private int numOfQueens;
	private long solutions=0;
	public QueensProblem(int numOfQueens)
	{
		queensArray=new int[numOfQueens];
		this.numOfQueens=numOfQueens;
	}
	
	public void solveQueensProblem()
	{
		arrangeQueensProblem(0);
		System.out.println(" total number of solutions : "+solutions);
	}
	
	private void arrangeQueensProblem(int rowIndex)
	{
		for(int i=0;i<numOfQueens;i++)
		{
			if(isPlaceValid(rowIndex,i))
			{
				queensArray[rowIndex]=i;
				
				if(rowIndex==numOfQueens-1)
				{
					printQueens();
					System.out.println("\n");
				}
				else
				{
					arrangeQueensProblem(rowIndex+1);
				}
			}
		}
	}

	private void printQueens() 
	{
			System.out.println("solution number : "+(solutions++));
			for(int i=0;i<numOfQueens;i++)
			{
				for (int j = 0; j < numOfQueens; j++) 
				{
					if(queensArray[i]==j)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		
	}

	private boolean isPlaceValid(int rowIndex, int columnIndex) 
	{
		for(int i=0;i<rowIndex;i++)
		{
			if(queensArray[i]==columnIndex)
			{
				return false;
			}
			
			if((i-rowIndex)==(queensArray[i]-columnIndex))
			{
				return false;
			}
			if((i-rowIndex)==(columnIndex-queensArray[i]))
			{
				return false;
			}
		}
		return true;
	}
}
