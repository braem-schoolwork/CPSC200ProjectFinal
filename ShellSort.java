import java.util.ArrayList;

public class ShellSort implements Sort
{
  //private data members
	private sortParams sParams;
		
  //constructors 
	public ShellSort()
	{
		sParams = null;
	}

//always initialize the memory usage to 0
	public void initialize(sortParams s)
	{
		sParams = s;
		sParams.setMemUsage(0);
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
	 * Shell Short Methods
	 * 
	 */
	void ShSort(int[] arr, int start, int end, ArrayList<Integer> gapSeq, Direction dir)
	{
		int memUsage = 0;
		memUsage += 32;
		TestPeakUsage(memUsage);
		for(int k=0; k<gapSeq.size(); ++k)
		{
			memUsage += gapSeq.size()*32;
			TestPeakUsage(memUsage);
			int gap = gapSeq.get(k);
			memUsage += 32;
			TestPeakUsage(memUsage);
			for(int i=gap; i<end; ++i)
			{
				memUsage += 32;
				TestPeakUsage(memUsage);
				int val = arr[i];
				memUsage += 32;
				TestPeakUsage(memUsage);
				int j = i - gap;
				if(dir == Direction.ASCENDING)
				{
					while(j>=start && arr[j]>val)
					{
						arr[j+gap] = arr[j];
						j -= gap;
					}
				}
				else
				{
					while(j>=start && arr[j]<val)
					{
						arr[j+gap] = arr[j];
						j -= gap;
					}
				}
				arr[j+gap] = val;
				memUsage -= 64;
			}
			memUsage -= 64;
		}
		memUsage -= 32;
	}
	
  /*
   * Sort Method Implementation
   * sorts in order the input has using the private ShSort
   * methods above
   */
	public void sort(sortParams sParams)
	{
		sParams.setMemUsage(0);
		ShSort(sParams.getArray(), sParams.getStartIndex(), sParams.getEndIndex(), sParams.getGapSeq(), sParams.getDirection());
	}
}
