package game;

public class Cell {
	private int x;
	private int y;
	private int minmaxValue;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
	
	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	} 
	
	
	public void setMinMaxValue(int minmaxValue) {
		this.minmaxValue = minmaxValue;
	}

	public int getMinMaxValue() {
		return minmaxValue;
	}
	
	public String toString()
	{
		return "("+this.x+","+this.y+")";
	}
}
