import java.util.ArrayList;

/*
 * Primarily for the Sort Menu
 * abstract because this class should never be instantiated
 */
public abstract class Sorter
{
	/*
	 * Method to run the sort and return the sortResults object
	 */
	public static sortResults sort(sortParams sParams)
	{
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		ExpParams e = new ExpParams();
	//saving the values that get changed during dummyruns
		int threshold = sParams.getThreshold();
		int arrSize = sParams.getArrSize();
		int[] arr = sParams.getArray();
	//building Experiment parameters based on user output
		e.setArrSize(sParams.getArrSize());
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setSortType(sParams.getSortType());
		e.setGapSeqType(sParams.getGapSeqType());
		e.setNumOfIterations(10);
		e.setSortType(sParams.getSortType());
		if(e.getSortType() == sortType.SHELL)
		{
			sParams.setGapSeq(GapSeqGenerator.generateGapSeq(sParams));
		}
		sParams.setStartIndex(0);
		sParams.setMemUsage(0);
		Sort sorter = null;
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		DummyRuns.RunDummy(e, sParams, sorter);
	//reverting changes from dummyruns
		sParams.setThreshold(threshold);
		sParams.setArrSize(arrSize);
		e.setArrSize(arrSize);
		sParams.setArray(arr);
		sParams.setMemUsage(0);
		sorter.initialize(sParams);
	//sorting
		doSort.runSort(e, sParams, sorter, sParams.getArrSize(), results);
	//returning the first and only result logged
		return results.get(0);
	}
}