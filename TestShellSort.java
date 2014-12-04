import java.util.ArrayList;


public class TestShellSort
{
//testing the test for peak memory usage
	private static ArrayList<String> TestTestPeakUsage()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ShellSort s = new ShellSort();
		sortParams sP = new sortParams();
		sP.setMemUsage(64);
		s.initialize(sP);
		int memUsage1 = 96;
		int memUsage2 = 32;
	//experiment step 1
		s.TestPeakUsage(memUsage1);
	//testing case 1
		if(s.getSortParams().getMemUsage() != memUsage1)
		{
			n = "TestPeakUsage when greater";
			arrOfProblems.add(n);
		}
	//experiment step 2
		s.initialize(sP);
		s.TestPeakUsage(memUsage2);
	//testing case 2
		if(s.getSortParams().getMemUsage() != sP.getMemUsage())
		{
			n = "TestPeakUsage when less than";
			arrOfProblems.add(n);
		}
		return arrOfProblems;
	}
		
//testing ShSortMethod
	private static ArrayList<String> TestShSortMethod()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		ShellSort s = new ShellSort();
		int[] arrIN = {4, 7, 2, 0, 15, 200, 1, 37};
		int[] arrOUT = {0, 1, 2, 4, 7, 15, 37, 200};
		int[] arrIN2 = {4, 7, 9, 0, 12, 98, 1, 24};
		int[] arrOUT2 = {98, 24, 12, 9, 7, 4, 1, 0};
		sortParams sP = new sortParams();
		s.initialize(sP);
		sP.setArrSize(arrIN.length);
	//experiment step 1
		sP.setGapSeqType(gapSeqType.SHELL);
		s.ShSort(arrIN, 0, arrIN.length, GapSeqGenerator.generateGapSeq(sP), Direction.ASCENDING);
	//testing case 1
		for(int i=0; i<arrIN.length; i++)
		{
			if(arrIN[i] != arrOUT[i])
			{
				n = "Shell Sort Ascending with SHELL gap sequence";
				arrOfProblems.add(n);
			}
		}
	//experiment step 2
		sP.setGapSeqType(gapSeqType.KNUTH);
		s.ShSort(arrIN, 0, arrIN.length, GapSeqGenerator.generateGapSeq(sP), Direction.ASCENDING);
	//testing case 2
		for(int i=0; i<arrIN.length; i++)
		{
			if(arrIN[i] != arrOUT[i])
			{
				n = "Shell Sort Ascending with KNUTH gap sequence";
				arrOfProblems.add(n);
			}
		}
	//experiment step 3
		sP.setGapSeqType(gapSeqType.TOKUDA);
		s.ShSort(arrIN, 0, arrIN.length, GapSeqGenerator.generateGapSeq(sP), Direction.ASCENDING);
	//testing case 3
		for(int i=0; i<arrIN.length; i++)
		{
			if(arrIN[i] != arrOUT[i])
			{
				n = "Shell Sort Ascending with TOKUDA gap sequence";
				arrOfProblems.add(n);
			}
		}
	//experiment step 4
		sP.setGapSeqType(gapSeqType.SHELL);
		s.ShSort(arrIN2, 0, arrIN2.length, GapSeqGenerator.generateGapSeq(sP), Direction.DESCENDING);
	//testing case 4
		for(int i=0; i<arrIN2.length; i++)
		{
			if(arrIN2[i] != arrOUT2[i])
			{
				n = "Shell Sort Descending with SHELL gap sequence";
				arrOfProblems.add(n);
			}
		}
	//experiment step 2
		sP.setGapSeqType(gapSeqType.KNUTH);
		s.ShSort(arrIN2, 0, arrIN2.length, GapSeqGenerator.generateGapSeq(sP), Direction.DESCENDING);
	//testing case 2
		for(int i=0; i<arrIN2.length; i++)
		{
			if(arrIN2[i] != arrOUT2[i])
			{
				n = "Shell Sort Descending with KNUTH gap sequence";
				arrOfProblems.add(n);
			}
		}
	//experiment step 3
		sP.setGapSeqType(gapSeqType.TOKUDA);
		s.ShSort(arrIN2, 0, arrIN2.length, GapSeqGenerator.generateGapSeq(sP), Direction.DESCENDING);
	//testing case 3
		for(int i=0; i<arrIN2.length; i++)
		{
			if(arrIN2[i] != arrOUT2[i])
			{
				n = "Shell Sort Descending with TOKUDA gap sequence";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
		
//testing the sort wrapper method
	private static ArrayList<String> TestSort()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		Sort s = new ShellSort();
		sortParams sP = new sortParams();
		int[] arrIN = {7, 400, 207, 152, 671};
		int[] arrOUTas = {7, 152, 207, 400, 671};
		int[] arrOUTds = {671, 400, 207, 152, 7};
		sP.setArray(arrIN);
		sP.setStartIndex(0);
		sP.setEndIndex(arrIN.length);
		sP.setArrSize(arrIN.length);
		s.initialize(sP);
	//because we already covered shell sort ascending and descending
	//with all gap sequences, it doesn't matter what gap sequence we use
		sP.setGapSeqType(gapSeqType.TOKUDA);
		sP.setGapSeq(GapSeqGenerator.generateGapSeq(sP));
	//experiment step 1
		sP.setDirection(Direction.ASCENDING);
		s.sort(sP);
	//testing case 1
		for(int i=0; i<arrIN.length; i++)
		{
			if(s.getSortParams().getArray()[i] != arrOUTas[i])
			{
				n = "Shell Sort's Sort wrapper (Ascending)";
				arrOfProblems.add(n);
			}
		}
	//experiment step 2
		sP.setDirection(Direction.DESCENDING);
		s.sort(sP);
	//testing case 2
		for(int i=0; i<arrIN.length; i++)
		{
			if(s.getSortParams().getArray()[i] != arrOUTds[i])
			{
				n = "Shell Sort's Sort wrapper (Descending)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
		
	/*
	 * Runs all of the unit tests in this class
	 */
	/*
	 * Runs all of the unit tests in this class
	 */
	public static void TestShSort()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Shell Sort";
		ArrayList<String> g = TestTestPeakUsage();
		ArrayList<String> g2 = TestShSortMethod();
		ArrayList<String> g3 = TestSort();
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
		if(!g3.isEmpty())
		{
			for(int i=0; i<g3.size(); i++)
			{
				if(!g3.get(i).equals(""))
				{
					whatTests.add(g3.get(i));
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