import java.util.ArrayList;


public class TestChooseAlgorithm
{
	private static ArrayList<String> testChooseSortAlgo()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ExpParams e = new ExpParams();
		e.setSortType(sortType.SELECTION);
		Sort s = null;
	//experiment step 1
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 1
		if(!(s instanceof SelectionSort))
		{
			n = "ChooseSortAlgorithm when sort type is Selection Sort";
			arrOfProblems.add(n);
		}
	//experiment step 2
		e.setSortType(sortType.INSERTION);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 2
		if(!(s instanceof InsertionSort))
		{
			n = "ChooseSortAlgorithm when sort type is Insertion Sort";
			arrOfProblems.add(n);
		}
	//experiment step 3
		e.setSortType(sortType.SHELL);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 3
		if(!(s instanceof ShellSort))
		{
			n = "ChooseSortAlgorithm when sort type is Shell Sort";
			arrOfProblems.add(n);
		}
	//experiment step 4
		e.setSortType(sortType.MERGE);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 4
		if(!(s instanceof MergeSort))
		{
			n = "ChooseSortAlgorithm when sort type is Merge Sort";
			arrOfProblems.add(n);
		}
	//experiment step 5
		e.setSortType(sortType.QUICK);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 5
		if(!(s instanceof QuickSort))
		{
			n = "ChooseSortAlgorithm when sort type is QuickSort";
			arrOfProblems.add(n);
		}
	//experiment step 6
		e.setSortType(sortType.MERGEHYBRID);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 6
		if(!(s instanceof MergeSortHybrid))
		{
			n = "ChooseSortAlgorithm when sort type is Merge Sort Hybrid";
			arrOfProblems.add(n);
		}
	//experiment step 7
		e.setSortType(sortType.QUICKHYBRID);
		s = chooseAlgorithm.chooseSortAlgo(s, e);
	//testing case 7
		if(!(s instanceof QuickSortHybrid))
		{
			n = "ChooseSortAlgorithm when sort type is QuickSort Hybrid";
			arrOfProblems.add(n);
		}
		return arrOfProblems;
	}
/*
 * Runs all of the unit tests in this class
 */
	public static void TestChooseSortingAlgorithm()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Choose Sorting Algorithm";
		ArrayList<String> g = testChooseSortAlgo();
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
