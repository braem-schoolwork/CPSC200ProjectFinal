
public class SelectionSort implements Sort
{
  //private data members
	private sortParams sParams;
	
  //constructors 
	public SelectionSort()
	{
		sParams = null;
	}
	
  //initializer method
	public void initialize(sortParams s)
	{
		sParams = s;
	}
  //getter
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
	 * Selection Sort Methods for Ascending/Descending
	 * (Logic for the sorting)
	 */
	void SelSort(int[] arr, int start, int end, Direction dir)
	{
		int memUsage = 0;
		memUsage += 32;
		TestPeakUsage(memUsage);
		int nextPos = start;
		while(nextPos<end)
		{
			memUsage += 32;
			TestPeakUsage(memUsage);
			int minElementSoFar = nextPos;
			memUsage += 32;
			TestPeakUsage(memUsage);
			if(dir == Direction.ASCENDING)
			{
				for(int i = nextPos+1; i<end; ++i)
				{
					if(arr[i]<arr[minElementSoFar])
					{
						minElementSoFar = i;
					}
				}
			}
			else
			{
				for(int i = nextPos+1; i<end; ++i)
				{
					if(arr[i]>arr[minElementSoFar])
					{
						minElementSoFar = i;
					}
				}
			}
			memUsage -= 32;
			memUsage += 32;
			TestPeakUsage(memUsage);
			int temp = arr[nextPos];
			arr[nextPos] = arr[minElementSoFar];
			arr[minElementSoFar] = temp;
			++nextPos;
			memUsage -= 64;
		}
		memUsage -= 32;
	}
	
  /*
   * Sort Method Implementation
   * sorts in order the input has using the private SelSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		SelSort(sParams.getArray(), sParams.getStartIndex(), sParams.getEndIndex(), sParams.getDirection());
		this.sParams.setArray(sParams.getArray());
	}
}
