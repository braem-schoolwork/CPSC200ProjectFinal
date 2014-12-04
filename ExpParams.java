/*
 * parameters for the different experiments
 */
public class ExpParams
{
//private data
	private int arrSize;
	private GenArrayType gType;
	private sortType sType;
	private Direction sortDirection;
	private int ArrayStartSize;
	private int ArrayStopSize;
	private int ArrayIncrementSize;
	private gapSeqType gapType;
	private expType eType;
	private int numOfIterations;
	
//constructors
	public ExpParams()
	{
		arrSize = 1;
		gType = null;
		sType = null;
		sortDirection = null;
		ArrayStartSize = 1;
		ArrayStopSize = 1;
		ArrayIncrementSize = 1;
		gapType = null;
		eType = null;
		numOfIterations = 0;
	}
	public ExpParams(int arrSize, GenArrayType gType, sortType sType, Direction sortDirection, int ArrayStartSize, int ArrayStopSize, int ArrayIncrementSize, gapSeqType gapType, expType eType, int numOfIterations)
	{
		this.arrSize = arrSize;
		this.gType = gType;
		this.sType = sType;
		this.sortDirection = sortDirection;
		this.ArrayStartSize = ArrayStartSize;
		this.ArrayStopSize = ArrayStopSize;
		this.ArrayIncrementSize = ArrayIncrementSize;
		this.gapType = gapType;
		this.eType = eType;
		this.numOfIterations = numOfIterations;
	}
	
	//getters
	public int getArrSize()
	{
		return arrSize;
	}
	public GenArrayType getGenArrayType()
	{
		return gType;
	}
	public sortType getSortType()
	{
		return sType;
	}
	public Direction getSortDirection()
	{
		return sortDirection;
	}
	public int getArrayStartSize()
	{
		return ArrayStartSize;
	}
	public int getArrayStopSize()
	{
		return ArrayStopSize;
	}
	public int getArrayIncrementSize()
	{
		return ArrayIncrementSize;
	}
	public gapSeqType getGapSeqType()
	{
		return gapType;
	}
	public expType getExpType()
	{
		return eType;
	}
	public int getNumOfIterations()
	{
		return numOfIterations;
	}
	
	//setters
	public void setArrSize(int arrSize)
	{
		this.arrSize = arrSize;
	}
	public void setGenArrayType(GenArrayType gType)
	{
		this.gType = gType;
	}
	public void setSortType(sortType sType)
	{
		this.sType = sType;
	}
	public void setSortDirection(Direction sortDirection)
	{
		this.sortDirection = sortDirection;
	}
	public void setArrayStartSize(int ArrayStartSize)
	{
		this.ArrayStartSize = ArrayStartSize;
	}
	public void setArrayStopSize(int ArrayStopSize)
	{
		this.ArrayStopSize = ArrayStopSize;
	}
	public void setArrayIncrementSize(int ArrayIncrementSize)
	{
		this.ArrayIncrementSize = ArrayIncrementSize;
	}
	public void setGapSeqType(gapSeqType gapType)
	{
		this.gapType = gapType;
	}
	public void setExpType(expType eType)
	{
		this.eType = eType;
	}
	public void setNumOfIterations(int numOfIterations)
	{
		this.numOfIterations = numOfIterations;
	}
}
