/*
 * Class to run all or aggregate unit tests
 */
public class RunUnitTests
{
//run aggregate unit tests
	public static void RunAggregateUnitTests(int whatTest)
	{
		switch(whatTest)
		{
		case 1:
		{
			System.out.println("Running Selection Sort Unit Tests...");
			TestSelectionSort.TestSelSort();
		} break;
		case 2:
		{
			System.out.println("Running Insertion Sort Unit Tests...");
			TestInsertionSort.TestInsSort();
		} break;
		case 3:
		{
			System.out.println("Running Shell Sort Unit Tests...");
			TestShellSort.TestShSort();
		} break;
		case 4:
		{
			System.out.println("Running Merge Sort Unit Tests...");
			TestMergeSort.TestMSort();
		} break;
		case 5:
		{
			System.out.println("Running Quick Sort Unit Tests...");
			TestQuickSort.TestQSort();
		} break;
		case 6:
		{
			System.out.println("Running Merge Sort Hybrid Unit Tests...");
			TestMergeSortHybrid.TestMSortHybrid();
		} break;
		case 7:
		{
			System.out.println("Running QuickSort Hybrid Unit Tests...");
			TestQuickSortHybrid.TestQSortHybrid();
		} break;
		case 8:
		{
			System.out.println("Running Gap Sequence Generator Unit Tests...");
			TestGapSeqGenerator.TestGapSeqGen();
		} break;
		case 9:
		{
			System.out.println("Running Array Generator Unit Tests...");
			TestArrayGenerator.TestArrGen();
		} break;
		case 10:
		{
			System.out.println("Running Main Sorting Method Unit Tests...");
			TestDoSort.TestSorting();
		} break;
		case 11:
		{
			System.out.println("Running Sorter Unit Tests...");
			TestSorter.TestSortMenuSorter();
		} break;
		case 12:
		{
			System.out.println("Running Experiment Unit Tests...");
			TestExperiment.TestExperiments();
		} break;
		case 13:
		{
			System.out.println("Running Dummy Run Unit Test...");
			TestDummyRuns.TestDummyRun();
		} break;
		case 14:
		{
			System.out.println("Running Choose Sorting Algorithm Unit Test...");
			TestChooseAlgorithm.TestChooseSortingAlgorithm();
		} break;
		default: break;
		}
		System.out.println();
	}
	
//run all unit tests
	public static void RunAllUnitTests()
	{
		System.out.println("Running Selection Sort Unit Tests...");
		TestSelectionSort.TestSelSort();
		System.out.println();
		System.out.println("Running Insertion Sort Unit Tests...");
		TestInsertionSort.TestInsSort();
		System.out.println();
		System.out.println("Running Shell Sort Unit Tests...");
		TestShellSort.TestShSort();
		System.out.println();
		System.out.println("Running Merge Sort Unit Tests...");
		TestMergeSort.TestMSort();
		System.out.println();
		System.out.println("Running QuickSort Unit Tests...");
		TestQuickSort.TestQSort();
		System.out.println();
		System.out.println("Running Merge Sort Hybrid Unit Tests...");
		TestMergeSortHybrid.TestMSortHybrid();
		System.out.println();
		System.out.println("Running QuickSort Hybrid Unit Tests...");
		TestQuickSortHybrid.TestQSortHybrid();
		System.out.println();
		System.out.println("Running Gap Sequence Generator Unit Tests...");
		TestGapSeqGenerator.TestGapSeqGen();
		System.out.println();
		System.out.println("Running Array Generator Unit Tests...");
		TestArrayGenerator.TestArrGen();
		System.out.println();
		System.out.println("Running Main Sorting Method Unit Tests...");
		TestDoSort.TestSorting();
		System.out.println();
		System.out.println("Running Sorter Unit Tests...");
		TestSorter.TestSortMenuSorter();
		System.out.println();
		System.out.println("Running Experiment Unit Tests...");
		TestExperiment.TestExperiments();
		System.out.println();
		System.out.println("Running Dummy Run Unit Test...");
		TestDummyRuns.TestDummyRun();
		System.out.println();
		System.out.println("Running Choose Sorting Algorithm Unit Test...");
		TestChooseAlgorithm.TestChooseSortingAlgorithm();
		System.out.println();
	}
}
