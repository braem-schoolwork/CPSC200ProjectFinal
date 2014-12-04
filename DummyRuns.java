
public abstract class DummyRuns
{
	/*
	 * class for running a dummy sort
	 * hardcoded a bit. wont effect anything
	 */
	static void RunDummy(ExpParams e, sortParams s, Sort sorter)
	{
		long startTime = System.nanoTime();
		long stopTime = 1;
		int i = 5;
		s.setThreshold(16);
	//stops after 3 seconds
		while(stopTime <= 3000000000L)
		{
		//just does some general sorting
			e.setArrSize(i);
			s.setArrSize(e.getArrSize());
			s.setEndIndex(i);
			if(e.getSortType() == sortType.SHELL)
			{
				s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
			}
			for(int j = 0; j < 10; j++)
			{
				int[] arr = ArrayGenerator.genArray(e);
				s.setArray(arr);
				sorter.initialize(s);
				sorter.sort(s);
				s.setMemUsage(sorter.getSortParams().getMemUsage());
			}
			stopTime = System.nanoTime() - startTime;
		i+=10;
		}
	}
}