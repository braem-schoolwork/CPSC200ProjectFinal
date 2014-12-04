/*
 * class for storing the results of a sort
 */
public class sortResults
{
//private data
	private boolean successful;
	private long timeRequired;
	private int memoryUsage;
	private int[] array;
	private int arrSize;
	private gapSeqType gapType;
	private int threshold;
	
//constructors
	public sortResults()
	{
		successful = false;
		timeRequired = 1;
		memoryUsage = 1;
		array = null;
		arrSize = 1;
		gapType = null;
		threshold = 1;
	}
	public sortResults(boolean successful, long timeRequired, int memoryUsage, int[] array, int arrSize, gapSeqType gapType, int threshold)
	{
		this.successful = successful;
		this.timeRequired = timeRequired;
		this.memoryUsage = memoryUsage;
		this.array = array;
		this.arrSize = arrSize;
		this.gapType = gapType;
		this.threshold = threshold;
	}
	
	//getters
	public boolean getSuccessful()
	{
		return successful;
	}
	public long getTimeRequired()
	{
		return timeRequired;
	}
	public int getMemoryUsage()
	{
		return memoryUsage;
	}
	public int[] getArray()
	{
		return array;
	}
	public int getArrSize()
	{
		return arrSize;
	}
	public gapSeqType getGapType()
	{
		return gapType;
	}
	public int getThreshold()
	{
		return threshold;
	}
	
	//setters
	public void setSuccessful(boolean successful)
	{
		this.successful = successful;
	}
	public void setTimeRequired(long timeRequired)
	{
		this.timeRequired = timeRequired;
	}
	public void setMemoryUsage(int memoryUsage)
	{
		this.memoryUsage = memoryUsage;
	}
	public void setArray(int[] array)
	{
		this.array = array;
	}
	public void setArrSize(int arrSize)
	{
		this.arrSize = arrSize;
	}
	public void setGapType(gapSeqType gapType)
	{
		this.gapType = gapType;
	}
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
}
