import java.util.Arrays;


public class MergeSort implements Sort
{
//private data members
	sortParams sParams;
	
//constructors
	public MergeSort()
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
	 * Merge Sort Methods for Ascending/Descending
	 * (Logic for the sorting)
	 */
	void MSort(int[] arr, int arrSize, Direction dir, int memUsage)
	{
	//a full copy of the array gets copied each recursion
		memUsage += 32*(arrSize);
		TestPeakUsage(memUsage);
	//copies the arrays into 2 parts
		int[] LHS = Arrays.copyOfRange(arr, 0, arrSize/2);
		int[] RHS = Arrays.copyOfRange(arr, LHS.length, arrSize);
	//recursive step
		if(LHS.length>1)
		{
			MSort(LHS, LHS.length, dir, memUsage);
		}
		if(RHS.length>1)
		{
			MSort(RHS, RHS.length, dir, memUsage);
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
   * sorts in order the input has using the private MergeSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		int memUsage = 0;
		MSort(sParams.getArray(), sParams.getArray().length, sParams.getDirection(), memUsage);
	}
}