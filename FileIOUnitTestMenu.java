import java.util.ArrayList;
import java.util.Scanner;


public class FileIOUnitTestMenu
{
	/*
	 * Unit Test Menu
	 */
//Used to run unit all or aggregate unit tests
	static void UnitTestMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to run all unit tests or aggregate unit tests?");
		System.out.println("1. Run all unit tests");
		System.out.println("2. Run aggregate unit tests");
		int a = scanner.nextInt();
		while(a < 1 || a > 2)
		{
			System.out.println("Please enter a valid value");
			System.out.println("1 to Run all unit tests, or");
			System.out.println("2 to Run aggregate unit tests");
			a = scanner.nextInt();
		}
		if(a == 2)
		{
			System.out.println("What group of unit tests would you like to run?");
			System.out.println("1. Selection Sort");
			System.out.println("2. Insertion Sort");
			System.out.println("3. Shell Sort");
			System.out.println("4. Merge Sort");
			System.out.println("5. QuickSort");
			System.out.println("6. Merge Sort Hybrid");
			System.out.println("7. QuickSort Hybrid");
			System.out.println("8. Gap Sequence Generator");
			System.out.println("9. Array Generator");
			System.out.println("10. Main Sorting Method");
			System.out.println("11. Sorter from inputs");
			System.out.println("12. Experiments");
			System.out.println("13. Dummy Run");
			System.out.println("14. Choose Sorting Algorithm");
			int whichTest = scanner.nextInt();
			while(whichTest < 1 || whichTest > 14)
			{
				System.out.println("Please enter a valid value");
				System.out.println("1 to Run Selection Sort unit tests,");
				System.out.println("2 to Run Insertion Sort unit tests,");
				System.out.println("3 to Run Shell Sort unit tests,");
				System.out.println("4 to Run Merge Sort unit tests,");
				System.out.println("5 to Run QuickSort unit tests,");
				System.out.println("6 to Run Merge Sort Hybrid unit tests,");
				System.out.println("7 to Run QuickSort Hybrid unit tests,");
				System.out.println("8 to Run Gap Sequence Generator unit tests,");
				System.out.println("9 to Run Array Generator unit tests,");
				System.out.println("10 to Run Main Sorting Method unit tests,");
				System.out.println("11 to Run Sorter from inputs unit tests,");
				System.out.println("12 to Run Experiment unit tests,");
				System.out.println("13 to Run Dummy Run unit tests, or");
				System.out.println("14 to Run Choose Sorting Algorithm unit tests.");
				whichTest = scanner.nextInt();
			}
			System.out.println("Running the selected unit tests...");
			System.out.println();
			RunUnitTests.RunAggregateUnitTests(whichTest);
		}
		else
		{
			System.out.println("Running all unit tests...");
			System.out.println();
			RunUnitTests.RunAllUnitTests();
		}
		System.out.println();
		System.out.println("Done running unit tests.");
		scanner.close();
	}
	
//displays the results of the unit tests
	public static void displayUnitTestResults(boolean isCorrect, String unitTestName, ArrayList<String> whatTests)
	{
		System.out.print(unitTestName);
		if(isCorrect)
		{
			System.out.println(" is running correctly.");
		}
		else
		{
			System.out.println(" is not running correctly.");
			System.out.println("Problems:");
			for(int i=0; i<whatTests.size(); i++)
			{
				if(!whatTests.get(i).equals(""))
				{
					System.out.println("Error in applying "+whatTests.get(i));
				}
			}
		}
	}
//overloaded method for simpler unit tests
	public static void displayUnitTestResults(boolean isCorrect, String unitTestName)
	{
		System.out.print(unitTestName);
		if(isCorrect)
		{
			System.out.println(" is running correctly.");
		}
		else
		{
			System.out.println(" is not running correctly.");
		}
	}
}