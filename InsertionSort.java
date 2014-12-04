

public class InsertionSort implements Sort
{
  //private data members
	private sortParams sParams;
		
  //constructors 
	public InsertionSort()
	{
		sParams = null;
	}
	
	public void initialize(sortParams s)
	{
		sParams = s;
	}
  //getters
	public sortParams getSortParams()
	{
		return sParams;
	}
	
	void TestPeakUsage(int memUsage)
	{
		if(memUsage > sParams.getMemUsage())
		{
			sParams.setMemUsage(memUsage);
		}
	}
	/* 
	 * Insertion Sort Methods for Ascending/Descending
	 * (Logic for the sorting)
	 */
	void InSort(int[] arr, int start, int end, Direction dir)
	{
		int memUsage = 0;
		memUsage += 32;
		TestPeakUsage(memUsage);
		for(int i=start+1; i<end; ++i)
		{
			memUsage += 32;
			TestPeakUsage(memUsage);
			int val = arr[i];
			memUsage += 32;
			TestPeakUsage(memUsage);
			int j = i - 1;
			if(dir == Direction.ASCENDING)
			{
				while(j>=start&&arr[j]>val)
				{
					arr[j+1] = arr[j];
					--j;
				}
			}
			else
			{
				while(j>=start&&arr[j]<val)
				{
					arr[j+1] = arr[j];
					--j;
				}
			}
			arr[j+1] = val;
			memUsage -= 64;
		}
		memUsage -= 32;
	}
	
  /*
   * Sort Method Implementation
   * sorts in order the input has using the private InSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		sParams.setMemUsage(0);
		InSort(sParams.getArray(), sParams.getStartIndex(), sParams.getEndIndex(), sParams.getDirection());
	}
}
