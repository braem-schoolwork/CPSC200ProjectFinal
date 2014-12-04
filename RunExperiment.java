import java.io.IOException;

/*
 * Contains all of the RunExp methods
 * abstract to make sure the class cannot be instantiated
 */
public abstract class RunExperiment
{	
	/*
	 * RunExp methods
	 * these methods build an ExpParams object and pass through
	 * the filename to where they should be written
	 */
//1st experiment suite
	static void RunExp1(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SELECTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp2(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SELECTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp3(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SELECTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp4(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.INSERTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp5(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.INSERTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp6(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.INSERTION);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp7(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setNumOfIterations(10);
	//use SHELL gap sequence as a default
		e.setGapSeqType(gapSeqType.SHELL);
		Experiment.RunExp(e, filename);
	}
	static void RunExp8(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setGapSeqType(gapSeqType.SHELL);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp9(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(5000);
		e.setArrayStopSize(150000);
		e.setArrayIncrementSize(5000);
		e.setGapSeqType(gapSeqType.SHELL);
		e.setNumOfIterations(10);
		Experiment.RunExp(e, filename);
	}
	static void RunExp10(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.COMPLEX);
		e.setSortType(sortType.SHELL);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(10000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(10000);
		e.setNumOfIterations(10);
	//gapSeqType.MULTIPLE used to let Experiment.RunExp know that it needs
	//to run all of the gap sequences
		e.setGapSeqType(gapSeqType.MULTIPLE);
		Experiment.RunExp(e, filename);
	}
	
	/*
	 * 2nd experiment suite
	 */
	static void RunExp11(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp12(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp13(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp14(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.MERGEHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp15(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.MERGEHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp16(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.MERGEHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp17(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp18(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp19(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.BASIC);
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp20(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.QUICKHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp21(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.QUICKHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.REVERSESORTED);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp22(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.HYBRID);
		e.setSortType(sortType.QUICKHYBRID);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.FIVEDISTINCTVALUES);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp23(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.SORTVSHYBRID);
		e.setSortType(sortType.MERGE);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp24(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.SORTVSHYBRID);
		e.setSortType(sortType.QUICK);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
	static void RunExp25(String filename) throws IOException
	{
		ExpParams e = new ExpParams();
		e.setExpType(expType.TOP3VS);
		e.setSortDirection(Direction.ASCENDING);
		e.setGenArrayType(GenArrayType.RANDOM);
		e.setArrayStartSize(50000);
		e.setArrayStopSize(1000000);
		e.setArrayIncrementSize(50000);
		e.setNumOfIterations(5);
		Experiment.RunExp(e, filename);
	}
}
