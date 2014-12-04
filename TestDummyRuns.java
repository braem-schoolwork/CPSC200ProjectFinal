

public class TestDummyRuns
{
	private static boolean TestRunDummy()
	{
	//setup
		ExpParams e = new ExpParams();
		sortParams s = new sortParams();
		Sort sorter = new SelectionSort();
		e.setSortType(sortType.SELECTION);
		e.setSortDirection(Direction.ASCENDING);
		s.setDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
	//experiment step
		long startTime = System.nanoTime();
		DummyRuns.RunDummy(e, s, sorter);
		long endTime = System.nanoTime() - startTime;
	//testing case
		if(endTime < 3000000000L)
		{
			return false;
		}
	//return true if dummyRuns runs for 3 or more seconds
		return true;
	}
	
	public static void TestDummyRun()
	{
		String Testname = "Dummy Runs";
		boolean isCorrect = TestRunDummy();
		FileIOUnitTestMenu.displayUnitTestResults(isCorrect, Testname);
	}
}
