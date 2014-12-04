import java.util.Scanner;


public class FileIOSortMenu
{
	/*
	 * Sort Menu
	 */
//Used to run sorts with a randomly generated array that the user wants
	static void SortMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What size of array do you want to sort?");
		int size = scanner.nextInt();
		while(size < 0)
		{
			System.out.println("Please enter a positive value");
			size = scanner.nextInt();
		}
		System.out.println("Which order do you want to sort this array?");
		System.out.println("1. Ascending");
		System.out.println("2. Descending");
		int sortOrder = scanner.nextInt();
		while(sortOrder < 1 || sortOrder > 2)
		{
			System.out.println("Please enter a valid value");
			System.out.println("1 to sort in ascending order, or");
			System.out.println("2 to sort in descending order");
			sortOrder = scanner.nextInt();
		}
		System.out.println("What algorithm do you want to use?");
		System.out.println("1. Selection sort");
		System.out.println("2. Insertion sort");
		System.out.println("3. Shell sort");
		System.out.println("4. Merge sort");
		System.out.println("5. Quicksort");
		System.out.println("6. Merge sort Hybrid");
		System.out.println("7. Quicksort Hybrid");
		int whichAlgo = scanner.nextInt();
		while(whichAlgo < 1 || whichAlgo > 7)
		{
			System.out.println("Please enter a valid value");
			System.out.println("1 for Selection sort,");
			System.out.println("2 for Insertion sort,");
			System.out.println("3 for Shell sort,");
			System.out.println("4 for Merge sort,");
			System.out.println("5 for Quicksort,");
			System.out.println("6 for Merge sort Hybrid, or");
			System.out.println("7 for Quicksort Hybrid,");
			whichAlgo = scanner.nextInt();
		}
		int whichGapSeq = 0;
		if(whichAlgo == 3)
		{
			System.out.println("What gap sequence do you want to use with Shell Sort?");
			System.out.println("1. SHELL");
			System.out.println("2. KNUTH");
			System.out.println("3. TOKUDA");
			whichGapSeq = scanner.nextInt();
			while(whichGapSeq < 1 || whichGapSeq > 3)
			{
				System.out.println("Please enter a valid value");
				System.out.println("1 for Shell gap sequence,");
				System.out.println("2 for Knuth gap sequence, or");
				System.out.println("3 for Tokuda gap sequence");
				whichGapSeq = scanner.nextInt();
			}
		}
		int threshold = 1;
		if(whichAlgo > 5)
		{
			System.out.println("What threshold do you want to use with the hybrid?");
			threshold = scanner.nextInt();
			while(threshold > size)
			{
				System.out.println("Your threshold cannot exceed the size of array you've chosen.");
				System.out.println("Would you rather change");
				System.out.println("1. The array size, or");
				System.out.println("2. The threshold");
				int which = scanner.nextInt();
				while(which < 0 || which > 2)
				{
					System.out.println("Invalid input");
					System.out.println("Enter 1 to change the array size, or");
					System.out.println("2 to change the threshold");
					which = scanner.nextInt();
				}
				if(which == 1)
				{
					System.out.println("Please enter a value equal to, or higher than, "+threshold);
					size = scanner.nextInt();
					System.out.println("OK");
				}
				else
				{
					System.out.println("Please enter a value lower than "+size);
					threshold = scanner.nextInt();
					System.out.println("OK");
				}
			}
		}
		scanner.close();
		doSort(size, sortOrder, whichAlgo, whichGapSeq, threshold);
	}
	
//converts the user inputs to an sParams object and then uses Sorter.java to sort
	private static void doSort(int size, int sortOrder, int whichAlgo, int whichGapSeq, int threshold)
	{
		sortParams sParams = new sortParams();
	//setting the sParams object
		sParams.setArray(ArrayGenerator.genRandomArray(size));
		sParams.setArrSize(size);
		sParams.setThreshold(threshold);
		System.out.println("Inputs:");
		switch(sortOrder)
		{
		case 1:
		{
			sParams.setDirection(Direction.ASCENDING);
			System.out.println("Sort in ascending order");
		} break;
		case 2:
		{
			sParams.setDirection(Direction.DESCENDING);
			System.out.println("Sort in descending order");
		} break;
		default: break;
		}
		switch(whichAlgo)
		{
		case 1:
		{
			sParams.setSortType(sortType.SELECTION);
			System.out.println("Selection Sort algorithm");
		} break;
		case 2:
		{
			sParams.setSortType(sortType.INSERTION);
			System.out.println("Insertion Sort algorithm");
		} break;
		case 3:
		{
			sParams.setSortType(sortType.SHELL);
			System.out.print("Shell Sort algorithm with a ");
		} break;
		case 4:
		{
			sParams.setSortType(sortType.MERGE);
			System.out.print("Merge Sort algorithm");
		} break;
		case 5:
		{
			sParams.setSortType(sortType.QUICK);
			System.out.print("Quicksort algorithm");
		} break;
		case 6:
		{
			sParams.setSortType(sortType.MERGEHYBRID);
			System.out.println("Merge Sort Hybrid algorithm with a threshold of "+threshold);
		} break;
		case 7:
		{
			sParams.setSortType(sortType.QUICKHYBRID);
			System.out.println("QuickSort Hybrid algorithm with a threshold of "+threshold);
		} break;
		default: break;
		}
		switch(whichGapSeq)
		{
		case 0: break;
		case 1:
		{
			sParams.setGapSeqType(gapSeqType.SHELL);
			sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
			System.out.println("Shell gap sequence.");
		} break;
		case 2:
		{
			sParams.setGapSeqType(gapSeqType.KNUTH);
			sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
			System.out.println("Knuth gap sequence.");
		} break;
		case 3:
		{
			sParams.setGapSeqType(gapSeqType.TOKUDA);
			sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
			System.out.println("Tokuda gap sequence.");
		} break;
		default: break;
		}
		System.out.println();
		System.out.println("Computing...");
		sort(sParams);
	}
	
//method to run a sort using Sorter.java
	private static void sort(sortParams s)
	{
		sortResults r = Sorter.sort(s);
		displaySortResults(r);
	}
	
//Method to provide the user with some feedback about the sort
	private static void displaySortResults(sortResults r)
	{
		System.out.println();
		System.out.println("Sort completed");
		System.out.println("Information about the sort:");
		String output;
		if(r.getSuccessful())
		{
			output = "The sort was successful";
		}
		else
		{
			output = "The sort was unsuccessful";
		}
		System.out.println(output+", took "+r.getTimeRequired()+" nanoseconds to complete, and used "+r.getMemoryUsage()+" bits of memory.");
	}
}
