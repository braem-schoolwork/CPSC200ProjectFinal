import java.util.ArrayList;

/*
 * deepest class. used for actually running a sort a specified number of times
 * and filling the list of results passed to it
 * should never be instantiated, hence the abstraction
 */
public abstract class doSort
{
/*
 * method for sorting
 */
	static void runSort(ExpParams e, sortParams s, Sort sorter, int arraySize, ArrayList<sortResults> results)
	{
	//new result for this sort
		sortResults result = new sortResults();
	//flag to check if the sort was correct
		boolean flag = false;
	//the end index will be the array size
		s.setEndIndex(arraySize);
	//time and memory usage variables
		long avgtime = 0;
		int avgMemUsage = 0;
	//runs the sort for the specified number of iterations
		for(int j = 0; j < e.getNumOfIterations(); j++)
		{
		//generate appropriate array
			int[] arr = ArrayGenerator.genArray(e);
			s.setArray(arr);
			long startTime = System.nanoTime();		//start timer
			sorter.sort(s);								//actual sorting of array
			long time = System.nanoTime() - startTime;		//end timer
			avgtime += time;							//counting up the times each iteration
			avgMemUsage += s.getMemUsage();	//counting up memory usage every iteration
			flag = arrCheck(s);		//checks correctness of sort
		//if this sort was incorrect, we break out of the loop.
		//this is to ensure if any sort result is incorrect, it will be logged below in a sortResults object
			if(!flag)
			{
				e.setNumOfIterations(-1);
			}
		}
	//sets results of the experiment
		result.setThreshold(s.getThreshold());		//defaults to 1. will not effect anything that isn't a hybrid sort
		result.setArrSize(arraySize);		
		result.setMemoryUsage(avgMemUsage/e.getNumOfIterations());		//sets average memory usage
		result.setSuccessful(flag);
		result.setGapType(s.getGapSeqType());	//if not shell sort, this will still be null and not effect anything
		result.setTimeRequired(avgtime/(long)e.getNumOfIterations());	//sets average time required
	//adds this particular result to the list of results
		results.add(result);
	//resets memory usage
	}
	
/*
 * method to check whether the sort was correct
 */
	static boolean arrCheck(sortParams s)
	{
		boolean isSorted = true;
		int[] arr = s.getArray();
	//iterates through the array checking every possible index
	//for correctness
		switch(s.getDirection())
		{
		case ASCENDING:
		{
			for(int i = 0; i<arr.length-1; ++i)
			{
				if(arr[i+1] < arr[i])
				{
					isSorted = false;
				}
			}
		} break;
		case DESCENDING:
		{
			for(int i = 0; i<arr.length-1; ++i)
			{
				if(arr[i+1] > arr[i])
				{
					isSorted = false;
				}
			}
		} break;
		default:
		{
			isSorted = false;
		} break;
		}
		return isSorted;
	}
}
