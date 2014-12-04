import java.util.ArrayList;

/*
 * Unit Tests for doSort.java
 */
public class TestDoSort
{
	private static ArrayList<String> testDoSortMethod()
	{
	//setup
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ExpParams e = new ExpParams();
		e.setNumOfIterations(5);
		e.setArrSize(500);
		e.setGenArrayType(GenArrayType.RANDOM);
		ArrayList<String> tmplist = testSelSort(e);
	//testing every sort according to doSort.java
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));		//adds all the problems to the arraylist
		}
		tmplist = testInsSort(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = testShSort(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = testMSort(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = testQSort(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = testMSortHybrid(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = testQSortHybrid(e);
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		return arrOfProblems;
	}
	
//testing quicksort hybrid according to doSort
	private static ArrayList<String> testQSortHybrid(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		Sort sorter = new QuickSortHybrid();
		for(int t=50; t<e.getArrSize(); t+=50)
		{
			s.setMemUsage(0);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, e.getArrSize(), results);
			for(int i=0; i<results.size(); i++)
			{
				if(!results.get(i).getSuccessful())
				{
					n = "Quick Sort Hybrid was not successful (Ascending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getMemoryUsage() < 0)
				{
					n = "Incorrect Memory Usage with Quick Sort Hybrid (Ascending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getTimeRequired() < 0)
				{
					n = "Incorrect average time of sort with Quick Sort Hybrid (Ascending)";
					arrOfProblems.add(n);
				}
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		for(int t=50; t<e.getArrSize(); t+=50)
		{
			s.setMemUsage(0);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, e.getArrSize(), results);
			for(int i=0; i<results.size(); i++)
			{
				if(!results.get(i).getSuccessful())
				{
					n = "Quick Sort Hybrid was not successful (Descending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getMemoryUsage() < 0)
				{
					n = "Incorrect Memory Usage with Quick Sort Hybrid (Descending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getTimeRequired() < 0)
				{
					n = "Incorrect average time of sort with Quick Sort Hybrid (Descending)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
//testing merge sort hybrid according to doSort
	private static ArrayList<String> testMSortHybrid(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		Sort sorter = new MergeSortHybrid();
		for(int t=50; t<e.getArrSize(); t+=50)
		{
			s.setMemUsage(0);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, e.getArrSize(), results);
			for(int i=0; i<results.size(); i++)
			{
				if(!results.get(i).getSuccessful())
				{
					n = "Merge Sort Hybrid was not successful (Ascending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getMemoryUsage() < 0)
				{
					n = "Incorrect Memory Usage with Merge Sort Hybrid (Ascending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getTimeRequired() < 0)
				{
					n = "Incorrect average time of sort with Merge Sort Hybrid (Ascending)";
					arrOfProblems.add(n);
				}
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		for(int t=50; t<e.getArrSize(); t+=50)
		{
			s.setMemUsage(0);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, e.getArrSize(), results);
			for(int i=0; i<results.size(); i++)
			{
				if(!results.get(i).getSuccessful())
				{
					n = "Merge Sort Hybrid was not successful (Descending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getMemoryUsage() < 0)
				{
					n = "Incorrect Memory Usage with Merge Sort Hybrid (Descending)";
					arrOfProblems.add(n);
				}
				if(results.get(i).getTimeRequired() < 0)
				{
					n = "Incorrect average time of sort with Merge Sort Hybrid (Descending)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
//testing quicksort according to doSort
	private static ArrayList<String> testQSort(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		Sort sorter = new QuickSort();
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Quick Sort was not successful (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Quick Sort (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Quick Sort (Ascending)";
				arrOfProblems.add(n);
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Quick Sort was not successful (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Quick Sort (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Quick Sort (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
//testing merge sort according to doSort
	private static ArrayList<String> testMSort(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		Sort sorter = new MergeSort();
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Merge Sort was not successful (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Merge Sort (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Merge Sort (Ascending)";
				arrOfProblems.add(n);
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Merge Sort was not successful (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Merge Sort (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Merge Sort (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
//testing shell sort according to doSort
	private static ArrayList<String> testShSort(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArrSize(e.getArrSize());
		s.setArray(ArrayGenerator.genArray(e));
		s.setGapSeqType(gapSeqType.SHELL);
		s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
		s.setMemUsage(0);
		Sort sorter = new ShellSort();
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Ascending, Shell)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Ascending, Shell)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Ascending, Shell)";
				arrOfProblems.add(n);
			}
		}
		s.setGapSeqType(gapSeqType.KNUTH);
		s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Ascending, Knuth)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Ascending, Knuth)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Ascending, Knuth)";
				arrOfProblems.add(n);
			}
		}
		s.setGapSeqType(gapSeqType.TOKUDA);
		s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Ascending, Tokuda)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Ascending, Tokuda)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Ascending, Tokuda)";
				arrOfProblems.add(n);
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Descending, Tokuda)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Descending, Tokuda)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Descending, Tokuda)";
				arrOfProblems.add(n);
			}
		}
		s.setGapSeqType(gapSeqType.KNUTH);
		s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Descending, Knuth)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Descending, Knuth)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Descending, Knuth)";
				arrOfProblems.add(n);
			}
		}
		s.setGapSeqType(gapSeqType.SHELL);
		s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Shell Sort was not successful (Ascending, Shell)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Incorrect Memory Usage with Shell Sort (Ascending, Shell)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Shell Sort (Ascending, Shell)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
//testing insertion sort according to doSort
	private static ArrayList<String> testInsSort(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		Sort sorter = new InsertionSort();
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Insertion Sort was not successful (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Incorrect Memory Usage with Insertion Sort (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Insertion Sort (Ascending)";
				arrOfProblems.add(n);
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Insertion Sort was not successful (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Incorrect Memory Usage with Insertion Sort (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Insertion Sort (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
//testing selection sort according to doSort
	private static ArrayList<String> testSelSort(ExpParams e)
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		sortParams s = new sortParams();
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		s.setDirection(Direction.ASCENDING);
		s.setStartIndex(0);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		Sort sorter = new SelectionSort();
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Selection Sort was not successful (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Incorrect Memory Usage with Selection Sort (Ascending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Selection Sort (Ascending)";
				arrOfProblems.add(n);
			}
		}
		s.setDirection(Direction.DESCENDING);
		s.setArray(ArrayGenerator.genArray(e));
		s.setMemUsage(0);
		sorter.initialize(s);
		doSort.runSort(e, s, sorter, e.getArrSize(), results);
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Selection Sort was not successful (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Incorrect Memory Usage with Selection Sort (Descending)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Incorrect average time of sort with Selection Sort (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
	
//array check method test
	private static ArrayList<String> TestArrCheck()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		sortParams s = new sortParams();
		int[] asArr = {1, 5, 8, 72, 204, 507, 943, 2342};
		int[] raArr = {32, 21, 3452, 23, 342, 1241, 12, 234};
		int[] dsArr = {2622, 1231, 435, 234, 35, 9, 4, 2};
	//experiment step 1
		s.setArray(asArr);
		s.setDirection(Direction.ASCENDING);
	//testing case 1
		if(!doSort.arrCheck(s))
		{
			n = "Checking a Sorted Ascending Array";
			arrOfProblems.add(n);
		}
	//experiment step 2
		s.setArray(raArr);
		s.setDirection(Direction.DESCENDING);
	//testing case 2
		if(doSort.arrCheck(s))
		{
			n = "Checking a Random Array (ascending)";
			arrOfProblems.add(n);
		}
	//experiment step 3
		s.setArray(dsArr);
		s.setDirection(Direction.DESCENDING);
	//testing case 3
		if(!doSort.arrCheck(s))
		{
			n = "Checking a Sorted Descending Array";
			arrOfProblems.add(n);
		}
	//experiment step 4
		s.setArray(raArr);
		s.setDirection(Direction.ASCENDING);
	//testing case 4
		if(doSort.arrCheck(s))
		{
			n = "Checking a Random Array (descending)";
			arrOfProblems.add(n);
		}
	//returns true if none of the experiments done were false
		return arrOfProblems;
	}
	
	
	/*
	 * Runs all of the unit tests in this class
	 */
	public static void TestSorting()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Main Sorting Method";
		ArrayList<String> g = TestArrCheck();
		ArrayList<String> g2 = testDoSortMethod();
		if(!g.isEmpty())
		{
			for(int i=0; i<g.size(); i++)
			{
				if(!g.get(i).equals(""))
				{
					whatTests.add(g.get(i));
				}
			}
		}
		if(!g2.isEmpty())
		{
			for(int i=0; i<g2.size(); i++)
			{
				if(!g2.get(i).equals(""))
				{
					whatTests.add(g2.get(i));
				}
			}
		}
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