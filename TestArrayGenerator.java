import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Unit Tests for ArrayGenerator
 */
public class TestArrayGenerator
{
//testing random array generation
	private static String TestGenRandomArray()
	{
		String n = "";
	//setup
		int[] arr;
		Integer[] arrAscending = new Integer[100000];
		Integer[] arrDescending = new Integer[100000];
	//experiment step
		arr = ArrayGenerator.genRandomArray(100000);
	//testing case
		for(int i=0; i<arr.length; i++)
		{
			arrDescending[i] = arr[i];
			arrAscending[i] = arr[i];
		}
		Arrays.sort(arrAscending);
		Arrays.sort(arrDescending, Collections.reverseOrder());
		//using the assumption that if the array is sorted in any way then it isn't random
		//given a sufficiently large array size n=100000
		if(arr.equals(arrAscending) || arr.equals(arrDescending))
		{
			n = "Random Array Generation";
		}
		return n;
	}

//testing reverse sorted array generation
	private static ArrayList<String> TestGenReverseSortedArray()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ExpParams e = new ExpParams();
		e.setArrSize(10000);
	//experiment step 1
		e.setSortDirection(Direction.ASCENDING);
		int[] arr1 = ArrayGenerator.genReverseSortedArray(e);
	//testing case 1
		for(int i=0; i<arr1.length-1; i++)
		{
			if(arr1[i+1] > arr1[i])
			{
				n = "Reverse Sorted Array Generation (Ascending)";
				arrOfProblems.add(n);
			}
		}
	//experiment step 2
		e.setSortDirection(Direction.DESCENDING);
		int[] arr2 = ArrayGenerator.genReverseSortedArray(e);
	//testing case 2
		for(int i=0; i<arr2.length-1; i++)
		{
			if(arr2[i+1] < arr2[i])
			{
				n = "Reverse Sorted Array Generation (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
	
//testing 5 distinct value array generation
	private static String Test5DistinctValueArray()
	{
		String n = "";
	//setup
		int[] arr;
	//experiment step
		arr = ArrayGenerator.gen5DistinctValueArray(20000);
	//testing case
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0 || arr[i]>4)
			{
				n = "5 Distinct Value Array Generation";
			}
		}
		return n;
	}
	
//test genArray method
	private static ArrayList<String> TestGenArray()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ExpParams e1 = new ExpParams();
		ExpParams e2 = new ExpParams();
		ExpParams e3 = new ExpParams();
		e1.setGenArrayType(GenArrayType.RANDOM);
		e2.setGenArrayType(GenArrayType.REVERSESORTED);
		e3.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e1.setArrSize(50000);
		e2.setArrSize(50000);
		e2.setSortDirection(Direction.ASCENDING);
		e3.setArrSize(50000);
	//experiment step 1
		int[] arr1 = ArrayGenerator.genArray(e1);
		Integer[] arr1Ascending = new Integer[50000];
		Integer[] arr1Descending = new Integer[50000];
	//testing case 1
		for(int i=0; i<arr1.length; i++)
		{
			arr1Descending[i] = arr1[i];
			arr1Ascending[i] = arr1[i];
		}
		Arrays.sort(arr1Ascending);
		Arrays.sort(arr1Descending, Collections.reverseOrder());
		if(arr1.equals(arr1Ascending) || arr1.equals(arr1Descending))
		{
			n = "Array Generator General Method (RANDOM)";
			arrOfProblems.add(n);
		}
	//experiment step 2
		int[] arr2 = ArrayGenerator.genArray(e2);
	//testing case 2
		for(int i=0; i<arr2.length-1; i++)
		{
			if(arr2[i+1] > arr2[i])
			{
				n = "Array Generator General Method (REVERSESORTED)";
				arrOfProblems.add(n);
			}
		}
	//experiment step 3
		int[] arr3 = ArrayGenerator.genArray(e3);
	//testing case 3
		for(int i=0; i<arr3.length; i++)
		{
			if(arr3[i]<0 || arr3[i]>4)
			{
				n = "Array Generator General Method (5DISTINCTVALUES)";
				arrOfProblems.add(n);
			}
		}
	//returns true if none of the experiments done were false
		return arrOfProblems;
	}
	
	/*
	 * Runs all of the unit tests in this class
	 */
	public static void TestArrGen()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Array Generator";
		whatTests.add(TestGenRandomArray());
		ArrayList<String> g = TestGenReverseSortedArray();
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
		whatTests.add(Test5DistinctValueArray());
		ArrayList<String> g2 = TestGenArray();
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
