import java.util.ArrayList;

/*
 * Parameters the sorting algorithms need
 */
public class sortParams
{
//private data
	private int[] array;
	private int arrSize;
	private Direction direction;
	private gapSeqType gtype;
	private ArrayList<Integer> gapSeq;
	private sortType type;
	private int memoryUsage;
	private int threshold;
	private int startIndex;
	private int endIndex;
	
//constructors
	public sortParams()
	{
		this.array = null;
		this.arrSize = 1;
		this.direction = Direction.ASCENDING;
		this.gtype = null;
		this.type = null;
		this.gapSeq = null;
		this.memoryUsage = 0;
		this.threshold = 1;
		this.startIndex = 0;
		this.endIndex = 0;
	}
	public sortParams(int[] array, Direction direction, sortType type, gapSeqType gtype, int arrSize, ArrayList<Integer> gapSeq, int memoryUsage, int threshold, int startIndex, int endIndex)
	{
		this.array = array;
		this.arrSize = arrSize;
		this.direction = direction;
		this.gtype = gtype;
		this.type = type;
		this.gapSeq = gapSeq;
		this.memoryUsage = memoryUsage;
		this.threshold = threshold;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	//getters
	public sortType getSortType()
	{
		return type;
	}
	public int[] getArray()
	{
		return array;
	}
	public Direction getDirection()
	{
		return direction;
	}
	public gapSeqType getGapSeqType()
	{
		return gtype;
	}
	public int getArrSize()
	{
		return arrSize;
	}
	public ArrayList<Integer> getGapSeq()
	{
		return gapSeq;
	}
	public int getMemUsage()
	{
		return memoryUsage;
	}
	public int getThreshold()
	{
		return threshold;
	}
	public int getStartIndex()
	{
		return startIndex;
	}
	public int getEndIndex()
	{
		return endIndex;
	}
	
	//setters
	public void setSortType(sortType type)
	{
		this.type = type;
	}
	public void setArray(int[] array)
	{
		this.array = array;
	}
	public void setDirection(Direction direction)
	{
		this.direction = direction;
	}
	public void setGapSeqType(gapSeqType gtype)
	{
		this.gtype = gtype;
	}
	public void setArrSize(int arrSize)
	{
		this.arrSize = arrSize;
	}
	public void setGapSeq(ArrayList<Integer> gapSeq)
	{
		this.gapSeq = gapSeq;
	}
	public void setMemUsage(int memoryUsage)
	{
		this.memoryUsage = memoryUsage;
	}
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
	public void setStartIndex(int startIndex)
	{
		this.startIndex = startIndex;
	}
	public void setEndIndex(int endIndex)
	{
		this.endIndex = endIndex;
	}
}