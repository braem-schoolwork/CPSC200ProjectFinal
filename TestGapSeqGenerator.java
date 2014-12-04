import java.util.ArrayList;

/*
 * Unit Tests for GapSeqGenerator
 */
public class TestGapSeqGenerator
{
//testing shell gap sequence generator
	private static String TestGenShellGapSeq()
	{
		String n = "";
	//setup
		int arraySize = 1000;
		int[] arrOUT = {500, 250, 125, 62, 31, 15, 7, 3, 1};
	//experiment step
		ArrayList<Integer> arr = GapSeqGenerator.genShellGapSeq(arraySize);
	//testing
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i) != arrOUT[i])
			{
				n = "Shell Gap Sequence Generator";
			}
		}
		return n;
	}
	
//testing knuth gap sequence generator
	private static String TestGenKnuthGapSeq()
	{
		String n = "";
	//setup
		int arraySize = 1200;
		int[] arrOUT = {364, 121, 40, 13, 4, 1};
	//experiment step
		ArrayList<Integer> arr = GapSeqGenerator.genKnuthGapSeq(arraySize);
	//testing
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i) != arrOUT[i])
			{
				n = "Knuth Gap Sequence Generator";
			}
		}
		return n;
	}
	
//testing tokuda gap sequence generator
	private static String TestGenTokudaGapSeq()
	{
		String n = "";
	//setup
		int arraySize = 1300;
		int[] arrOUT = {1182, 525, 233, 103, 46, 20, 9, 4, 1};
	//experiment step
		ArrayList<Integer> arr = GapSeqGenerator.genTokudaGapSeq(arraySize);
	//testing
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i) != arrOUT[i])
			{
				n = "Tokuda Gap Sequence Generator";
			}
		}
		return n;
	}
	
//testing the generateGapSeq method
	private static ArrayList<String> TestGenerateGapSeq()
	{
		String n = "";
		ArrayList<String> arrOfProblems = new ArrayList<String>();
	//setup
		int arraySize = 1000;
		int[] arrOUTsh = {500, 250, 125, 62, 31, 15, 7, 3, 1};
		int[] arrOUTkn = {121, 40, 13, 4, 1};
		int[] arrOUTto = {525, 233, 103, 46, 20, 9, 4, 1};
	//experiment step 1
		ArrayList<Integer> arrSH = GapSeqGenerator.genShellGapSeq(arraySize);
	//testing case 1
		for(int i=0; i<arrSH.size(); i++)
		{
			if(arrSH.get(i) != arrOUTsh[i])
			{
				n = "Generate Gap Sequence General Method (SHELL)";
				arrOfProblems.add(n);
			}
		}
	//experiment step 2
		ArrayList<Integer> arrKN = GapSeqGenerator.genKnuthGapSeq(arraySize);
	//testing case 2
		for(int i=0; i<arrKN.size(); i++)
		{
			if(arrKN.get(i) != arrOUTkn[i])
			{
				n = "Generate Gap Sequence General Method (SHELL)";
				arrOfProblems.add(n);
			}
		}
	//experiment step 3
		ArrayList<Integer> arrTO = GapSeqGenerator.genTokudaGapSeq(arraySize);
	//testing case 3
		for(int i=0; i<arrTO.size(); i++)
		{
			if(arrTO.get(i) != arrOUTto[i])
			{
				n = "Generate Gap Sequence General Method (SHELL)";
				arrOfProblems.add(n);
			}
		}
		return arrOfProblems;
	}
	
/*
 * Runs all of the unit tests in this class
 */
	public static void TestGapSeqGen()
	{
		ArrayList<String> whatTests = new ArrayList<String>();
		String Testname = "Gap Sequence Generator";
		whatTests.add(TestGenShellGapSeq());
		whatTests.add(TestGenKnuthGapSeq());
		whatTests.add(TestGenTokudaGapSeq());
		ArrayList<String> g = TestGenerateGapSeq();
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