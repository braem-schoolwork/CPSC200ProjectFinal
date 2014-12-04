import java.io.IOException;
import java.util.ArrayList;

/*
 * Contains the methods to run sorts and send the results to FileIOExperimentMenu
 * to write the results to a file specified by the user
 * Is abstract to make sure the class cannot be instantiated
 */
public abstract class Experiment
{
	
	static ArrayList<sortResults> runBasicSort(ExpParams e)
	{
	//list of results from the experiment
		ArrayList<sortResults> results = new ArrayList<sortResults>();
	//sort parameters
		sortParams s = new sortParams();
	//creating sorter object
		Sort sorter = null;
	//null if the type of sort isn't shell. wont effect rest of code
		s.setGapSeqType(e.getGapSeqType());
	//setting the direction for the sort using the one specified by the experiment parameters
		s.setDirection(e.getSortDirection());
	//starting index will always be 0
		s.setStartIndex(0);
	//initializing the sorter to whatever algorithm is chosen
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
	//runs a bunch of dummy tests to ensure proper results
		DummyRuns.RunDummy(e, s, sorter);
	//can set starting array size, as well as stopping size and incrementing size
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
		//generates a gap sequence if the type of sort is shell
			if(e.getSortType() == sortType.SHELL)
			{
				s.setArrSize(e.getArrSize());
				s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
			}
			doSort.runSort(e, s, sorter, i, results);
		}
		return results;
	}
	static ArrayList<sortResults> runComplexSort(ExpParams e)
	{
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		sortParams s = new sortParams();
		Sort sorter = null;
		s.setDirection(e.getSortDirection());
		s.setStartIndex(0);
		s.setGapSeqType(gapSeqType.SHELL);
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		DummyRuns.RunDummy(e, s, sorter);
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			s.setArrSize(e.getArrSize());
		//iterating through the gap sequences
			for(int g = 1; g<=3; g++)
			{
				switch(g)
				{
				case 1:
				{
					s.setGapSeqType(gapSeqType.SHELL);
				} break;
				case 2:
				{
					s.setGapSeqType(gapSeqType.KNUTH);
				} break;
				case 3:
				{
					s.setGapSeqType(gapSeqType.TOKUDA);
				} break;
				default: break;
				}
				s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
				doSort.runSort(e, s, sorter, i, results);
			}
		}
		return results;
	}
	static ArrayList<sortResults> runHybridSort(ExpParams e)
	{
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		sortParams s = new sortParams();
		Sort sorter = null;
		s.setDirection(e.getSortDirection());
		s.setStartIndex(0);
	//initializing the sorter to whatever algorithm is chosen
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		DummyRuns.RunDummy(e, s, sorter);
	//loops interchanged for layout purposes. does not change data
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			for(int t=0; t<=64; t++)
			{
			//thresholds of 2, 3, 4, 8, 16, 32, 64
				if(t==2 || t==3 || t==4 || t==8 || t==16 || t==32 || t==64)
				{
					s.setThreshold(t);
					s.setMemUsage(0);
					e.setArrSize(i);
					doSort.runSort(e, s, sorter, i, results);
				}
			}
		}
		return results;
	}
	static ArrayList<sortResults> runSortvsHybrid(ExpParams e)
	{
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		sortParams s = new sortParams();
		Sort sorter = null;
		s.setDirection(e.getSortDirection());
		s.setStartIndex(0);
	//initializing the sorter to whatever algorithm is chosen
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		DummyRuns.RunDummy(e, s, sorter);
		//initializing the sorter to the normal sort (merge or quicksort)
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
	//runs a bunch of dummy tests to ensure proper results
		DummyRuns.RunDummy(e, s, sorter);
	//basic sort for first sort
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			doSort.runSort(e, s, sorter, i, results);
		}
	//now changing expParams for the hybrid to run, and setting the best known threshold for each
		if(e.getSortType() == sortType.MERGE)
		{
			e.setSortType(sortType.MERGEHYBRID);
			s.setThreshold(64);
		}
		else
		{
			e.setSortType(sortType.QUICKHYBRID);
			s.setThreshold(64);
		}
		s.setMemUsage(0);
	//setting sorter to the hybrid
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
	//now running another basic sort. this time for the hybrid
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, i, results);
		}	//note that now the array of results will contain both the sorts information
		return results;
	}
	static ArrayList<sortResults> runTop3(ExpParams e)
	{
		ArrayList<sortResults> results = new ArrayList<sortResults>();
		sortParams s = new sortParams();
		Sort sorter = null;
		s.setGapSeqType(e.getGapSeqType());
		s.setDirection(e.getSortDirection());
		s.setStartIndex(0);
	//basic sort for SHELL with fastest gap sequence (tokuda)
		e.setSortType(sortType.SHELL);
		s.setGapSeqType(gapSeqType.TOKUDA);
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
	//runs a bunch of dummy tests to ensure proper results
		DummyRuns.RunDummy(e, s, sorter);
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			s.setArrSize(e.getArrSize());
			s.setGapSeq(GapSeqGenerator.generateGapSeq(s));
			doSort.runSort(e, s, sorter, i, results);
		}
	//now a basic sort for MERGEHYBRID
		s.setMemUsage(0);
		e.setSortType(sortType.MERGEHYBRID);
		s.setThreshold(64);
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, i, results);
		}
	//finally another basic sort for QUICKHYBRID
		s.setMemUsage(0);
		e.setSortType(sortType.QUICKHYBRID);
		s.setThreshold(64);
		sorter = chooseAlgorithm.chooseSortAlgo(sorter, e);
		for(int i=e.getArrayStartSize(); i<=e.getArrayStopSize(); i+=e.getArrayIncrementSize())
		{
			e.setArrSize(i);
			sorter.initialize(s);
			doSort.runSort(e, s, sorter, i, results);
		}	//note that all of the results are contained in the array of sortResults
		return results;
	}
	/*
	 * Method used by RunExps to run the sorts and pass the results to
	 * FileIOExperimentMenu to write them to a file
	 */
	public static void RunExp(ExpParams e, String filename) throws IOException
	{
	//list of results from the experiment
		ArrayList<sortResults> results = new ArrayList<sortResults>();
	//switch on the type of experiment
		//4 types. Basic, Complex (exp10), hybrid, and vs.
		switch(e.getExpType())
		{
		case BASIC:
		{
			results = runBasicSort(e);
		} break;
		case COMPLEX:
		{
			results = runComplexSort(e);
		} break;
		case HYBRID:
		{
			results = runHybridSort(e);
		} break;
		case SORTVSHYBRID:
		{
			results = runSortvsHybrid(e);
		} break;
		case TOP3VS:
		{
			results = runTop3(e);
		} break;
		default:
		{
			results = null;
		} break;
		}
	//writes the results to a file
		FileIOExperimentMenu.writeSortToFile(e, results, filename);
	}
}
