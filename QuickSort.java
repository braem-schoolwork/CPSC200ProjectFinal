

public class QuickSort implements Sort
{
//private data members
	sortParams sParams;
		
//constructors
	public QuickSort()
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
	 * Quick Sort Methods for Ascending/Descending
	 * (Logic for the sorting)
	 */
	void QSort(int[] arr, int LHS, int RHS, Direction dir, int memUsage)
	{
		memUsage += 96;
		TestPeakUsage(memUsage);
		int pivotVal = choosePVal(arr, LHS, RHS);
		memUsage -= 64;
		memUsage += 32;
		TestPeakUsage(memUsage);
		int i = LHS;
		memUsage += 32;
		TestPeakUsage(memUsage);
		int j = RHS;
		if(dir == Direction.ASCENDING)
		{
			while(i <= j)
			{
				while(arr[i] < pivotVal)
				{
					i++;
				}
				while(arr[j] > pivotVal)
				{
					j--;
				}
				if(i <= j)
				{
					memUsage += 32;
					TestPeakUsage(memUsage);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
					memUsage -= 32;
				}
			}
		}
		else
		{
			while(i <= j)
			{
				while(arr[i] > pivotVal)
				{
					i++;
				}
				while(arr[j] < pivotVal)
				{
					j--;
				}
				if(i <= j)
				{
					memUsage += 32;
					TestPeakUsage(memUsage);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
					memUsage -= 32;
				}
			}
		}
		if(LHS < j)
		{
			QSort(arr, LHS, j, dir, memUsage);
		}
		if(i < RHS)
		{
			QSort(arr, i, RHS, dir, memUsage);
		}
		memUsage -= 32*3;
	}
//method for choosing a good pivot value
	int choosePVal(int[] arr, int start, int end)
	{
		int mid = start+(end - start)/2;
		int returnVal = arr[mid];
		if(arr[start]>arr[mid] && arr[start]<arr[end])
		{
			returnVal = arr[start];
		}
		if(arr[start]<arr[mid] && arr[start]>arr[end])
		{
			returnVal = arr[start];
		}
		
		if(arr[mid]>arr[start] && arr[mid]<arr[end])
		{
			returnVal = arr[mid];
		}
		if(arr[mid]<arr[start] && arr[mid]>arr[end])
		{
			returnVal = arr[mid];
		}
		
		if(arr[end]>arr[mid] && arr[end]<arr[start])
		{
			returnVal = arr[end];
		}
		if(arr[end]<arr[mid] && arr[end]>arr[start])
		{
			returnVal = arr[end];
		}
		return returnVal;
	}
	
  /*
   * Sort Method Implementation
   * sorts in order the input has using the private QuickSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		int memUsage = 0;
		QSort(sParams.getArray(), 0, sParams.getArray().length-1, sParams.getDirection(), memUsage);
		this.sParams.setArray(sParams.getArray());
	}
}
