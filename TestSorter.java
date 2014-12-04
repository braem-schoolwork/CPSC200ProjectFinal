import java.util.ArrayList;

/*
 * Unit Tests for Sorter
 */
public class TestSorter
{
//sorter method test
	private static ArrayList<String> TestSort()
	{
	//setup
		ArrayList<String> n = new ArrayList<String>();
		sortParams sParams = new sortParams();
		sortResults results = new sortResults();
		int[] arrIN = {78, 3, 407, 276, 46, 1, 9, 154};
		sParams.setArray(arrIN);
		sParams.setArrSize(arrIN.length);
		sParams.setStartIndex(0);
		sParams.setEndIndex(arrIN.length);
		if(!testSelSort(sParams, results, arrIN))
		{
			n.add("Selection Sort with accordance to Sorter.java");
		}
		if(!testInsSort(sParams, results))
		{
			n.add("Insertion Sort with accordance to Sorter.java");
		}
		if(!testShSort(sParams, results))
		{
			n.add("Shell Sort with accordance to Sorter.java");
		}
		if(!testMergeSort(sParams, results))
		{
			n.add("Merge Sort with accordance to Sorter.java");
		}
		if(!testQuickSort(sParams, results))
		{
			n.add("QuickSort with accordance to Sorter.java");
		}
		if(!testMergeSortHybrid(sParams, results))
		{
			n.add("Merge Sort Hybrid with accordance to Sorter.java");
		}
		if(!testQuickSortHybrid(sParams, results))
		{
			n.add("QuickSort Hybrid with accordance to Sorter.java");
		}
	//returns true if none of the experiments done were false
		return n;
	}
	
//testing selection sort with accordance to sorter
	private static boolean testSelSort(sortParams sParams, sortResults results, int[] arrIN)
	{
		int SelSortMem = 96;
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.SELECTION);
		results = Sorter.sort(sParams);
	//testing case 1
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() != SelSortMem || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		results = Sorter.sort(sParams);
	//testing case 2
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() != SelSortMem || !results.getSuccessful())
		{
			return false;
		}
		return true;
	}
//testing insertion sort with accordance to sorter
	private static boolean testInsSort(sortParams sParams, sortResults results)
	{
		int InsSortMem = 96;
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.INSERTION);
		results = Sorter.sort(sParams);
	//testing case 1
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() != InsSortMem || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		results = Sorter.sort(sParams);
	//testing case 2
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() != InsSortMem || !results.getSuccessful())
		{
			return false;
		}
		return true;
	}
//testing shell sort with accordance to sorter
	private static boolean testShSort(sortParams sParams, sortResults results)
	{
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.SHELL);
		sParams.setGapSeqType(gapSeqType.SHELL);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 1
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 2
		sParams.setGapSeqType(gapSeqType.KNUTH);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 2
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 3
		sParams.setGapSeqType(gapSeqType.TOKUDA);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 3
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 4
		sParams.setDirection(Direction.DESCENDING);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 4
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 5
		sParams.setGapSeqType(gapSeqType.KNUTH);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 5
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 6
		sParams.setGapSeqType(gapSeqType.SHELL);
		sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		results = Sorter.sort(sParams);
	//testing case 6
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
		return true;
	}
//testing merge sort with accordance to sorter
	private static boolean testMergeSort(sortParams sParams, sortResults results)
	{
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.MERGE);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 1
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 2
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
		return true;
	}
//testing quicksort with accordance to sorter
	private static boolean testQuickSort(sortParams sParams, sortResults results)
	{
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.QUICK);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 1
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 2
		if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
		{
			return false;
		}
		return true;
	}
//testing merge sort hybrid with accordance to sorter
	private static boolean testMergeSortHybrid(sortParams sParams, sortResults results)
	{
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.MERGEHYBRID);
	//testing case 1
		for(int t=2; t<sParams.getArrSize(); t++)
		{
			sParams.setThreshold(t);
			sParams.setMemUsage(0);
			results = Sorter.sort(sParams);
			if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
			{
				return false;
			}
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 2
		for(int t=2; t<sParams.getArrSize(); t++)
		{
			sParams.setThreshold(t);
			sParams.setMemUsage(0);
			results = Sorter.sort(sParams);
			if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
			{
				return false;
			}
		}
		return true;
	}
//testing quicksort hybrid with accordance to sorter
	private static boolean testQuickSortHybrid(sortParams sParams, sortResults results)
	{
	//experiment step 1
		sParams.setDirection(Direction.ASCENDING);
		sParams.setSortType(sortType.QUICKHYBRID);
	//testing case 1
		for(int t=2; t<sParams.getArrSize(); t++)
		{
			sParams.setThreshold(t);
			sParams.setMemUsage(0);
			results = Sorter.sort(sParams);
			if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
			{
				return false;
			}
		}
	//experiment step 2
		sParams.setDirection(Direction.DESCENDING);
		sParams.setMemUsage(0);
		results = Sorter.sort(sParams);
	//testing case 2
		for(int t=2; t<sParams.getArrSize(); t++)
		{
			sParams.setThreshold(t);
			sParams.setMemUsage(0);
			results = Sorter.sort(sParams);
			if(results.getTimeRequired() < 0 || results.getMemoryUsage() < 0 || !results.getSuccessful())
			{
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Runs all of the unit tests in this class
	 */
	public static void TestSortMenuSorter()
	{
		String Testname = "Sorter";
		ArrayList<String> whatTests = TestSort();
		boolean isCorrect = testIfFalse(whatTests);
		FileIOUnitTestMenu.displayUnitTestResults(isCorrect, Testname, whatTests);
	}
	
	private static boolean testIfFalse(ArrayList<String> whatTests)
	{
		for(int i=0; i<whatTests.size(); i++)
		{
			if(!whatTests.get(i).equals(""))
			{
				return false;
			}
		}
		return true;
	}
}
