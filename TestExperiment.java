import java.util.ArrayList;

/*
 * Unit Tests for Experiment
 */
public class TestExperiment
{
	
//testing runSelSort
	private static ArrayList<String> TestRunSorts()
	{
	//setup
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<String> tmplist = BasicSelSortTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = BasicInsSortTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = BasicShSortTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = BasicMSortTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = BasicQSortTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = MSortHybridTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = QSortHybridTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = ComplexTest();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = TestMSortvsHybrid();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = TestQSortvsHybrid();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		tmplist = TestTop3();
		for(int i=0; i<tmplist.size(); i++)
		{
			arrOfProblems.add(tmplist.get(i));
		}
		return arrOfProblems;
	}
	
	private static ArrayList<String> MSortHybridTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.MERGEHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runHybridSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runHybridSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runHybridSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runHybridSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runHybridSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runHybridSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> QSortHybridTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.QUICKHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runHybridSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runHybridSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runHybridSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runHybridSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runHybridSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runHybridSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getTimeRequired() < 0)
			{
				n = "Time calculation of Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> BasicQSortTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runBasicSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of QuickSort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> BasicMSortTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runBasicSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Merge Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> BasicInsSortTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.INSERTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runBasicSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Insertion Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Insertion Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Insertion Sort (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	
	private static ArrayList<String> BasicSelSortTest()
	{
	//setup
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.SELECTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runBasicSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Selection Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() != 96)
			{
				n = "Memory Usage of Selection Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Selection Sort (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> BasicShSortTest()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setGapSeqType(gapSeqType.SHELL);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runBasicSort(e);
	//testing case 1
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Random Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Random Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Random Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 2
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Reverse Sorted Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Reverse Sorted Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Random Sorted Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 3
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Five Distinct Values Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Five Distinct Values Array , Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Five Distinct Values Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 4
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Five Distinct Values Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Five Distinct Values Array , Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Five Distinct Values Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 5
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Reverse Sorted Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Reverse Sorted Array , Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Reverse Sorted Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 6
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Random Array, Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Random Array , Shell Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Random Array, Shell Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 7
		e.setGapSeqType(gapSeqType.KNUTH);
		e.setSortDirection(Direction.ASCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 7
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Random Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Random Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Random Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 8
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 8
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Reverse Sorted Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Reverse Sorted Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Reverse Sorted Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 9
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 9
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Five Distinct Values Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Five Distinct Values Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Five Distinct Values Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 10
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 10
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Five Distinct Values Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Five Distinct Values Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Five Distinct Values Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 11
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 11
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Reverse Sorted Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Reverse Sorted Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Reverse Sorted Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 12
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 12
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Random Array, Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Random Array , Knuth Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Random Array, Knuth Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 13
		e.setGapSeqType(gapSeqType.TOKUDA);
		e.setSortDirection(Direction.ASCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 13
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Random Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Random Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Random Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 14
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 14
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Reverse Sorted Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Reverse Sorted Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Reverse Sorted Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 15
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runBasicSort(e);
	//testing case 15
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Ascending, Five Distinct Values Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Ascending, Five Distinct Values Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Five Distinct Values Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 16
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runBasicSort(e);
	//testing case 16
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Five Distinct Values Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Five Distinct Values Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Five Distinct Values Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 17
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runBasicSort(e);
	//testing case 17
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Reverse Sorted Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Reverse Sorted Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Reverse Sorted Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 18
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runBasicSort(e);
	//testing case 18
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Shell Sort (Descending, Random Array, Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort (Descending, Random Array , Tokuda Gap Sequence)";
				arrOfProblems.add(n);
			}
			if(i >= 1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Random Array, Tokuda Gap Sequence)";
					arrOfProblems.add(n);
				}
			}
		}
	//returns true if all the unit tests pass
		return arrOfProblems;
	}
	private static ArrayList<String> ComplexTest()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setGapSeqType(gapSeqType.SHELL);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runComplexSort(e);
	//testing case 1
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runComplexSort(e);
	//testing case 2
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runComplexSort(e);
	//testing case 3
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runComplexSort(e);
	//testing case 4
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runComplexSort(e);
	//testing case 5
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runComplexSort(e);
	//testing case 6
		for(int i=0; i<results.size()-3; i+=3)
		{
			if(results.get(i).getGapType() != gapSeqType.SHELL)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+1).getGapType() != gapSeqType.KNUTH)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
			if(results.get(i+2).getGapType() != gapSeqType.TOKUDA)
			{
				n = "Complex Experiment Formatting";
				arrOfProblems.add(n);
			}
		}
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				n = "Correctness of Complex Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Complex Sort (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i >= 3)
			{
				if(results.get(i).getTimeRequired() < results.get(i-3).getTimeRequired())
				{
					n = "Time calculation of Shell Sort (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> TestMSortvsHybrid()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runSortvsHybrid(e);
	//testing case 1
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runSortvsHybrid(e);
	//testing case 2
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runSortvsHybrid(e);
	//testing case 3
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runSortvsHybrid(e);
	//testing case 4
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runSortvsHybrid(e);
	//testing case 5
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runSortvsHybrid(e);
	//testing case 6
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of Merge Sort vs Merge Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Merge Sort vs Merge Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of Merge Sort vs Merge Sort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> TestQSortvsHybrid()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runSortvsHybrid(e);
	//testing case 1
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vs QuickSort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runSortvsHybrid(e);
	//testing case 2
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vsQuickSort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runSortvsHybrid(e);
	//testing case 3
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vs QuickSort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runSortvsHybrid(e);
	//testing case 4
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vs QuickSort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runSortvsHybrid(e);
	//testing case 5
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vs QuickSort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runSortvsHybrid(e);
	//testing case 6
		for(int i=0; i<results.size()/2; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/2).getSuccessful())
			{
				n = "Correctness of QuickSort vs QuickSort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/2).getMemoryUsage() < 0)
			{
				n = "Memory Usage of QuickSort vs QuickSort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/2).getTimeRequired() < results.get((i+results.size()/2)-1).getTimeRequired())
				{
					n = "Time calculation of QuickSort vs QuickSort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	private static ArrayList<String> TestTop3()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ArrayList<sortResults> results;
	//experiment 1
		ExpParams e = new ExpParams();
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(10000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(5);
		results = Experiment.runTop3(e);
	//testing case 1
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 2
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runTop3(e);
	//testing case 2
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 3
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		results = Experiment.runTop3(e);
	//testing case 3
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Ascending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 4
		e.setSortDirection(Direction.DESCENDING);
		results = Experiment.runTop3(e);
	//testing case 4
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Five Distinct Values Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Five Distinct Values Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 5
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		results = Experiment.runTop3(e);
	//testing case 5
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Reverse Sorted Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Reverse Sorted Array)";
					arrOfProblems.add(n);
				}
			}
		}
	//experiment 6
		e.setGenArrayType(GenArrayType.RANDOM);
		results = Experiment.runTop3(e);
	//testing case 6
		for(int i=0; i<results.size()/3; i++)
		{
			if(!results.get(i).getSuccessful() || !results.get(i+results.size()/3).getSuccessful() || !results.get(i+(2*results.size())/3).getSuccessful())
			{
				n = "Correctness of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(results.get(i).getMemoryUsage() < 0 || results.get(i+results.size()/3).getMemoryUsage() < 0 || results.get(i+(2*results.size())/3).getMemoryUsage() < 0)
			{
				n = "Memory Usage of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Random Array)";
				arrOfProblems.add(n);
			}
			if(i>=1)
			{
				if(results.get(i).getTimeRequired() < results.get(i-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+results.size()/3).getTimeRequired() < results.get((i+results.size()/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
				if(results.get(i+(2*results.size())/3).getTimeRequired() < results.get((i+(2*results.size())/3)-1).getTimeRequired())
				{
					n = "Time calculation of Shell Sort vs Merge Sort Hybrid vs Quick Sort Hybrid (Descending, Random Array)";
					arrOfProblems.add(n);
				}
			}
		}
		return arrOfProblems;
	}
	
	/*
	 * Runs all of the unit tests in this class
	 */
	public static void TestExperiments()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Experiments";
		ArrayList<String> g = TestRunSorts();
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
