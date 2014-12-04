import java.util.Arrays;


public class MergeSortHybrid implements Sort
{
//private data members
	sortParams sParams;
		
//constructors
	public MergeSortHybrid()
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
	 * Merge Sort Hybrid Methods for Ascending/Descending
	 * (Logic for the sorting)
	 */
	void MSortHybrid(int[] arr, int arrSize, Direction dir, int threshold, int memUsage)
	{
		memUsage += 32*(arrSize);
		TestPeakUsage(memUsage);
		int[] LHS = Arrays.copyOfRange(arr, 0, arrSize/2);
		int[] RHS = Arrays.copyOfRange(arr, LHS.length, arrSize);
		if(LHS.length>threshold)
		{
			MSortHybrid(LHS, LHS.length, dir, threshold, memUsage);
		}
		else
		{
			InsertionSort inSort = new InsertionSort();
			sortParams s = new sortParams();
			s.setArray(LHS);
			s.setStartIndex(0);
			s.setEndIndex(LHS.length);
			s.setDirection(dir);
			inSort.initialize(s);
			inSort.sort(s);
		}
		if(RHS.length>threshold)
		{
			MSortHybrid(RHS, RHS.length, dir, threshold, memUsage);
		}
		else
		{
			InsertionSort inSort = new InsertionSort();
			sortParams s = new sortParams();
			s.setArray(RHS);
			s.setStartIndex(0);
			s.setEndIndex(RHS.length);
			s.setDirection(dir);
			inSort.initialize(s);
			inSort.sort(s);
			memUsage += inSort.getSortParams().getMemUsage();
			TestPeakUsage(memUsage);
			memUsage -= inSort.getSortParams().getMemUsage();
		}
		memUsage += 32;
		TestPeakUsage(memUsage);
		int L = 0;
		memUsage += 32;
		TestPeakUsage(memUsage);
		int R = 0;
	//merge step based on direction
		if(dir == Direction.ASCENDING)
		{
			memUsage += 32;
			TestPeakUsage(memUsage);
			for(int j=0; j<arrSize; ++j)
			{
				if((!(LHS.length==L) && !(RHS.length==R) && LHS[L]<RHS[R]) || RHS.length==R)
				{
					arr[j] = LHS[L];
					L++;
				}
				else if((!(LHS.length==L) && !(RHS.length==R) && LHS[L]>RHS[R]) || LHS.length==L)
				{
					arr[j] = RHS[R];
					R++;
				}
				else
				{
					arr[j] = LHS[L];
					j++;
					L++;
					arr[j] = RHS[R];
					R++;
				}
			}
			memUsage -= 32;
		}
		else
		{
			memUsage += 32;
			TestPeakUsage(memUsage);
			for(int j=0; j<arrSize; ++j)
			{
				if((!(LHS.length==L) && !(RHS.length==R) && LHS[L]>RHS[R]) || RHS.length==R)
				{
					arr[j] = LHS[L];
					L++;
				}
				else if((!(LHS.length==L) && !(RHS.length==R) && LHS[L]<RHS[R]) || LHS.length==L)
				{
					arr[j] = RHS[R];
					R++;
				}
				else
				{
					arr[j] = LHS[L];
					j++;
					L++;
					arr[j] = RHS[R];
					R++;
				}
			}
			memUsage -= 32;
		}
		memUsage -= 64;
	}
  /*
   * Sort Method Implementation
   * sorts in order the input has using the private SelSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		int memUsage = 0;
		MSortHybrid(sParams.getArray(), sParams.getArray().length, sParams.getDirection(), sParams.getThreshold(), memUsage);
	}
}
