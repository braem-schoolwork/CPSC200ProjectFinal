import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIOExperimentMenu
{
	/*
	 * Experiment Menu
	 */
//Used to run one or all of the experiments
	static void ExperimentMenu() throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to run all of the Experiments, run the first set of Experiments, run the second set of Experiments, or just run a singular Experiment?");
		System.out.println("1. Run all experiments");
		System.out.println("2. Run the first set of experiments");
		System.out.println("3. Run the second set of experiments");
		System.out.println("4. Run one experiment");
		int a = scanner.nextInt();
		while(a < 1 || a > 4)
		{
			System.out.println("Please enter a valid value");
			System.out.println("1 to Run all experiments,");
			System.out.println("2 to Run the first set of experiments,");
			System.out.println("3 to Run the second set of experiments, or");
			System.out.println("4 to Run one experiment");
			a = scanner.nextInt();
		}
		if(a > 0 && a < 4)
		{
			System.out.println("Enter in a directory name. This is where the experiment results will be logged.");
			String e = scanner.next();
			System.out.println("Computing...");
			RunSetOfExp(e, a);
		}
		else
		{
			System.out.println("Enter in a file name. This is where the experiment results will be logged.");
			String e = scanner.next();
			System.out.println("Out of the 25 experiments, which one do you want to run?");
			int r = scanner.nextInt();
			while(r < 1 || r > 25)
			{
				System.out.println("Please enter a value between 1 and 25 to run the corresponding experiments");
				r = scanner.nextInt();
			}
			RunAnExperiment(r, e);
		}
		scanner.close();
	}
	
//runs a single experiment to the specified file
	private static void RunAnExperiment(int ExpNum, String filename) throws IOException
	{
		String fullfilename = "C:\\"+filename;
		switch(ExpNum)
		{
		case 1:
		{
			System.out.println("Computing Experiment 1...");
			RunExperiment.RunExp1(fullfilename);
			System.out.println("Done Experiment 1.");
		} break;
		case 2:
		{
			System.out.println("Computing Experiment 2...");
			RunExperiment.RunExp2(fullfilename);
			System.out.println("Done Experiment 2.");
		} break;
		case 3:
		{
			System.out.println("Computing Experiment 3...");
			RunExperiment.RunExp3(fullfilename);
			System.out.println("Done Experiment 3.");
		} break;
		case 4:
		{
			System.out.println("Computing Experiment 4...");
			RunExperiment.RunExp4(fullfilename);
			System.out.println("Done Experiment 4.");
		} break;
		case 5:
		{
			System.out.println("Computing Experiment 5...");
			RunExperiment.RunExp5(fullfilename);
			System.out.println("Done Experiment 5.");
		} break;
		case 6:
		{
			System.out.println("Computing Experiment 6...");
			RunExperiment.RunExp6(fullfilename);
			System.out.println("Done Experiment 6.");
		} break;
		case 7:
		{
			System.out.println("Computing Experiment 7...");
			RunExperiment.RunExp7(fullfilename);
			System.out.println("Done Experiment 7.");
		} break;
		case 8:
		{
			System.out.println("Computing Experiment 8...");
			RunExperiment.RunExp8(fullfilename);
			System.out.println("Done Experiment 8.");
		} break;
		case 9:
		{
			System.out.println("Computing Experiment 9...");
			RunExperiment.RunExp9(fullfilename);
			System.out.println("Done Experiment 9.");
		} break;
		case 10:
		{
			System.out.println("Computing Experiment 10...");
			RunExperiment.RunExp10(fullfilename);
			System.out.println("Done Experiment 10.");
		} break;
		case 11:
		{
			System.out.println("Computing Experiment 11...");
			RunExperiment.RunExp11(fullfilename);
			System.out.println("Done Experiment 11.");
		} break;
		case 12:
		{
			System.out.println("Computing Experiment 12...");
			RunExperiment.RunExp12(fullfilename);
			System.out.println("Done Experiment 12.");
		} break;
		case 13:
		{
			System.out.println("Computing Experiment 13...");
			RunExperiment.RunExp13(fullfilename);
			System.out.println("Done Experiment 13.");
		} break;
		case 14:
		{
			System.out.println("Computing Experiment 14...");
			RunExperiment.RunExp14(fullfilename);
			System.out.println("Done Experiment 14.");
		} break;
		case 15:
		{
			System.out.println("Computing Experiment 15...");
			RunExperiment.RunExp15(fullfilename);
			System.out.println("Done Experiment 15.");
		} break;
		case 16:
		{
			System.out.println("Computing Experiment 16...");
			RunExperiment.RunExp16(fullfilename);
			System.out.println("Done Experiment 16.");
		} break;
		case 17:
		{
			System.out.println("Computing Experiment 17...");
			RunExperiment.RunExp17(fullfilename);
			System.out.println("Done Experiment 17.");
		} break;
		case 18:
		{
			System.out.println("Computing Experiment 18...");
			RunExperiment.RunExp18(fullfilename);
			System.out.println("Done Experiment 18.");
		} break;
		case 19:
		{
			System.out.println("Computing Experiment 19...");
			RunExperiment.RunExp19(fullfilename);
			System.out.println("Done Experiment 19.");
		} break;
		case 20:
		{
			System.out.println("Computing Experiment 20...");
			RunExperiment.RunExp20(fullfilename);
			System.out.println("Done Experiment 20.");
		} break;
		case 21:
		{
			System.out.println("Computing Experiment 21...");
			RunExperiment.RunExp21(fullfilename);
			System.out.println("Done Experiment 21.");
		} break;
		case 22:
		{
			System.out.println("Computing Experiment 22...");
			RunExperiment.RunExp22(fullfilename);
			System.out.println("Done Experiment 22.");
		} break;
		case 23:
		{
			System.out.println("Computing Experiment 23...");
			RunExperiment.RunExp23(fullfilename);
			System.out.println("Done Experiment 23.");
		} break;
		case 24:
		{
			System.out.println("Computing Experiment 24...");
			RunExperiment.RunExp24(fullfilename);
			System.out.println("Done Experiment 24.");
		} break;
		case 25:
		{
			System.out.println("Computing Experiment 25...");
			RunExperiment.RunExp25(fullfilename);
			System.out.println("Done Experiment 25.");
		} break;
		default: break;
		}
	}
	
	
//runs multiple experiments
	private static void RunSetOfExp(String dirname, int a) throws IOException
	{
		String fulldirname = "C:\\"+dirname;
		File dir = new File(fulldirname);
		dir.mkdir();
		switch(a)
		{
		case 1:
		{
			RunAllExp(fulldirname);
		} break;
		case 2:
		{
			RunFirstExpSuite(fulldirname);
		} break;
		case 3:
		{
			RunSecondExpSuite(fulldirname);
		} break;
		default: break;
		}
	}
	
//runs all experiments (first and second suites)
	private static void RunAllExp(String fulldirname) throws IOException
	{
		RunFirstExpSuite(fulldirname);
		RunSecondExpSuite(fulldirname);
	}
//runs all experiments in the first assignment
	private static void RunFirstExpSuite(String fulldirname) throws IOException
	{
		System.out.println("Computing Experiment 1...");
		RunExperiment.RunExp1(fulldirname+"\\Exp1");
		System.out.println("Done Experiment 1.");
		System.out.println();
		System.out.println("Computing Experiment 2...");
		RunExperiment.RunExp2(fulldirname+"\\Exp2");
		System.out.println("Done Experiment 2.");
		System.out.println();
		System.out.println("Computing Experiment 3...");
		RunExperiment.RunExp3(fulldirname+"\\Exp3");
		System.out.println("Done Experiment 3.");
		System.out.println();
		System.out.println("Computing Experiment 4...");
		RunExperiment.RunExp4(fulldirname+"\\Exp4");
		System.out.println("Done Experiment 4.");
		System.out.println();
		System.out.println("Computing Experiment 5...");
		RunExperiment.RunExp5(fulldirname+"\\Exp5");
		System.out.println("Done Experiment 5.");
		System.out.println();
		System.out.println("Computing Experiment 6...");
		RunExperiment.RunExp6(fulldirname+"\\Exp6");
		System.out.println("Done Experiment 6.");
		System.out.println();
		System.out.println("Computing Experiment 7...");
		RunExperiment.RunExp7(fulldirname+"\\Exp7");
		System.out.println("Done Experiment 7.");
		System.out.println();
		System.out.println("Computing Experiment 8...");
		RunExperiment.RunExp8(fulldirname+"\\Exp8");
		System.out.println("Done Experiment 8.");
		System.out.println();
		System.out.println("Computing Experiment 9...");
		RunExperiment.RunExp9(fulldirname+"\\Exp9");
		System.out.println("Done Experiment 9.");
		System.out.println();
		System.out.println("Computing Experiment 10...");
		RunExperiment.RunExp10(fulldirname+"\\Exp10");
		System.out.println("Done Experiment 10.");
		System.out.println();
	}
//runs all experiments in the second assignment
	private static void RunSecondExpSuite(String fulldirname) throws IOException
	{
		System.out.println("Computing Experiment 11...");
		RunExperiment.RunExp11(fulldirname+"\\Exp11");
		System.out.println("Done Experiment 11.");
		System.out.println();
		System.out.println("Computing Experiment 12...");
		RunExperiment.RunExp12(fulldirname+"\\Exp12");
		System.out.println("Done Experiment 12.");
		System.out.println();
		System.out.println("Computing Experiment 13...");
		RunExperiment.RunExp13(fulldirname+"\\Exp13");
		System.out.println("Done Experiment 13.");
		System.out.println();
		System.out.println("Computing Experiment 14...");
		RunExperiment.RunExp14(fulldirname+"\\Exp14");
		System.out.println("Done Experiment 14.");
		System.out.println();
		System.out.println("Computing Experiment 15...");
		RunExperiment.RunExp15(fulldirname+"\\Exp15");
		System.out.println("Done Experiment 15.");
		System.out.println();
		System.out.println("Computing Experiment 16...");
		RunExperiment.RunExp16(fulldirname+"\\Exp16");
		System.out.println("Done Experiment 16.");
		System.out.println();
		System.out.println("Computing Experiment 17...");
		RunExperiment.RunExp17(fulldirname+"\\Exp17");
		System.out.println("Done Experiment 17.");
		System.out.println();
		System.out.println("Computing Experiment 18...");
		RunExperiment.RunExp18(fulldirname+"\\Exp18");
		System.out.println("Done Experiment 18.");
		System.out.println();
		System.out.println("Computing Experiment 19...");
		RunExperiment.RunExp19(fulldirname+"\\Exp19");
		System.out.println("Done Experiment 19.");
		System.out.println();
		System.out.println("Computing Experiment 20...");
		RunExperiment.RunExp20(fulldirname+"\\Exp20");
		System.out.println("Done Experiment 20.");
		System.out.println();
		System.out.println("Computing Experiment 21...");
		RunExperiment.RunExp21(fulldirname+"\\Exp21");
		System.out.println("Done Experiment 21.");
		System.out.println();
		System.out.println("Computing Experiment 22...");
		RunExperiment.RunExp22(fulldirname+"\\Exp22");
		System.out.println("Done Experiment 22.");
		System.out.println();
		System.out.println("Computing Experiment 23...");
		RunExperiment.RunExp23(fulldirname+"\\Exp23");
		System.out.println("Done Experiment 23.");
		System.out.println();
		System.out.println("Computing Experiment 24...");
		RunExperiment.RunExp24(fulldirname+"\\Exp24");
		System.out.println("Done Experiment 24.");
		System.out.println();
		System.out.println("Computing Experiment 25...");
		RunExperiment.RunExp25(fulldirname+"\\Exp25");
		System.out.println("Done Experiment 25.");
		System.out.println();
	}
	
//gives the user some feedback on the experiment at hand
	static void UserFeedBack(ArrayList<sortResults> results, String fullfilename)
	{
		boolean flag = true;
	//if 1 result is unsuccessful, the whole experiment is unsuccessful
		for(int i=0; i<results.size(); i++)
		{
			if(!results.get(i).getSuccessful())
			{
				flag = false;
			}
		}
	//feedback
		if(flag)
		{
			System.out.println("The sort was successful");
		}
		else
		{
			System.out.println("The sort was unsuccessful");
		}
		System.out.println("Data has been writen to "+fullfilename);
	}
	
	/*
	 * Methods that write experiment info to the file.
	 * Each experiment type has a different way of formatting
	 */
//BASIC sort file format
	static void writeBasicToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//writes header
		writer.append("Average time and memory usage for sorting an array of size n with "+e.getSortType()+" Sort");
		writer.append('\n');
		writer.append("Size of array");
		writer.append(',');
		writer.append("Average Time of Sort in nanoseconds");
		writer.append(',');
		writer.append("Memory Usage in bits");
		writer.append('\n');
	//writes information of sort
		for(int i=0; i<results.size(); i++)
		{
			writer.append(""+results.get(i).getArrSize());
			writer.append(',');
			writer.append(""+results.get(i).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i).getMemoryUsage());
			writer.append('\n');
		}
	}
//COMPLEX sort file format
	static void writeComplexToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//writes header
		writer.append("Average time for the corresponding gap sequences for array size n in nanoseconds");
		writer.append('\n');
		writer.append("Size of array");
		writer.append(',');
		writer.append("Average time taken with Shell gap sequence in nanoseconds");
		writer.append(',');
		writer.append("Memory usage with Shell gap sequence in bits");
		writer.append(',');
		writer.append("Average time taken with Knuth gap sequence in nanoseconds");
		writer.append(',');
		writer.append("Memory usage with Knuth gap sequence in bits");
		writer.append(',');
		writer.append("Average time taken with Tokuda gap sequence in nanoseconds");
		writer.append(',');
		writer.append("Memory usage with Tokuda gap sequence in bits");
		writer.append('\n');
	//writes information of sort
		for(int i=0; i<results.size(); i++)
		{
			switch(results.get(i).getGapType())
			{
			case SHELL:
			{
				writer.append(""+results.get(i).getArrSize());
				writer.append(',');
				writer.append(""+results.get(i).getTimeRequired());
				writer.append(',');
				writer.append(""+results.get(i).getMemoryUsage());
			} break;
			case KNUTH:
			{
				writer.append(',');
				writer.append(""+results.get(i).getTimeRequired());
				writer.append(',');
				writer.append(""+results.get(i).getMemoryUsage());
			} break;
			case TOKUDA:
			{
				writer.append(',');
				writer.append(""+results.get(i).getTimeRequired());
				writer.append(',');
				writer.append(""+results.get(i).getMemoryUsage());
				writer.append('\n');
			} break;
			default: break;
			}
		}
	}
//HYBRID sort file format
	static void writeHybridToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//writes header
		writer.append("Average time and memory usage for sorting an array of size n with a given threshold with "+e.getSortType()+" Sort");
		writer.append('\n');
		writer.append("Size of array");
		writer.append(',');
		writer.append("Average Time of Sort in nanoseconds with Threshold = 2");
		writer.append(',');
		writer.append("Memory Usage in bits with Threshold = 2");
		writer.append(',');
		int ctr = 1;
		for(int i=1; i<results.size() && ctr < 7; i++)
		{
			if(results.get(i).getThreshold() != results.get(i-1).getThreshold())
			{
				writer.append("Average Time of Sort in nanoseconds with Threshold = "+results.get(i).getThreshold());
				writer.append(',');
				writer.append("Memory Usage in bits with Threshold = "+results.get(i).getThreshold());
				writer.append(',');
			}
			ctr++;
		}
		writer.append('\n');
	//writes information of sort
		writer.append(""+results.get(0).getArrSize());
		writer.append(',');
		for(int i=0; i<results.size(); i++)
		{
			if(i>=1 && results.get(i).getArrSize() != results.get(i-1).getArrSize())
			{
				writer.append('\n');
				writer.append(""+results.get(i).getArrSize());
				writer.append(',');
			}
			writer.append(""+results.get(i).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i).getMemoryUsage());
			writer.append(',');
		}
	}
//SORTVSHYBRID file format
	static void writeSortVSHybridToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//writes header
		if(e.getSortType() == sortType.MERGEHYBRID)
		{
			writer.append("Average time and memory usage for sorting an array of size n with MERGE Sort versus that of its Hybrid using Threshold = "+results.get(results.size()-1).getThreshold());
			writer.append('\n');
			writer.append("Size of array");
			writer.append(',');
			writer.append("Average Time of Sort in nanoseconds with MERGESORT");
			writer.append(',');
			writer.append("Memory Usage in bits with MERGESORT");
			writer.append(',');
			writer.append("Average Time of Sort in nanoseconds with MERGESORTHYBRID");
			writer.append(',');
			writer.append("Memory Usage in bits with MERGESORTHYBRID");
		}
		else
		{
			writer.append("Average time and memory usage for sorting an array of size n with QUICK Sort versus that of its Hybrid using Threshold = "+results.get(results.size()-1).getThreshold());
			writer.append('\n');
			writer.append("Size of array");
			writer.append(',');
			writer.append("Average Time of Sort in nanoseconds with QUICKSORT");
			writer.append(',');
			writer.append("Memory Usage in bits with QUICKSORT");
			writer.append(',');
			writer.append("Average Time of Sort in nanoseconds with QUICKSORTHYBRID");
			writer.append(',');
			writer.append("Memory Usage in bits with QUICKSORTHYBRID");
		}
		writer.append('\n');
	//writes information of sort
		for(int i=0; i<results.size()/2; i++)
		{
			writer.append(""+results.get(i).getArrSize());
			writer.append(',');
			writer.append(""+results.get(i).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i).getMemoryUsage());
			writer.append(',');
			writer.append(""+results.get(i+results.size()/2).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i+results.size()/2).getMemoryUsage());
			writer.append('\n');
		}
	}
//TOP3SORTS file format
	static void writeTop3VsToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//writes header
		writer.append("SHELL sort with a "+results.get(0).getGapType()+" gap sequence vs. MERGESORTHYBRID with a threshold of "+results.get(results.size()/2).getThreshold()+" vs. QUICKSORTHYBRID with a threshold of "+results.get(results.size()-1).getThreshold());
		writer.append('\n');
		writer.append("Size of array");
		writer.append(',');
		writer.append("Average Time of Sort in nanoseconds with SHELLSORT");
		writer.append(',');
		writer.append("Memory Usage in bits with SHELLSORT");
		writer.append(',');
		writer.append("Average Time of Sort in nanoseconds with MERGESORTHYBRID");
		writer.append(',');
		writer.append("Memory Usage in bits with MERGESORTHYBRID");
		writer.append(',');
		writer.append("Average Time of Sort in nanoseconds with QUICKSORTHYBRID");
		writer.append(',');
		writer.append("Memory Usage in bits with QUICKSORTHYBRID");
		writer.append('\n');
	//writes information of sort
		for(int i=0; i<results.size()/3; i++)
		{
			writer.append(""+results.get(i).getArrSize());
			writer.append(',');
			writer.append(""+results.get(i).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i).getMemoryUsage());
			writer.append(',');
			writer.append(""+results.get(i+results.size()/3).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i+results.size()/3).getMemoryUsage());
			writer.append(',');
			writer.append(""+results.get(i+(2*results.size())/3).getTimeRequired());
			writer.append(',');
			writer.append(""+results.get(i+(2*results.size())/3).getMemoryUsage());
			writer.append('\n');
		}
	}
	
//writes the results to the file using the above file formatting methods
	static void writeInfoToFile(ExpParams e, ArrayList<sortResults> results, FileWriter writer) throws IOException
	{
	//different formatting for different experiments
		switch(e.getExpType())
		{
		case BASIC:
		{
			writeBasicToFile(e, results, writer);
		} break;
		case COMPLEX:
		{
			writeComplexToFile(e, results, writer);
		} break;
		case HYBRID:
		{
			writeHybridToFile(e, results, writer);
		} break;
		case SORTVSHYBRID:
		{
			writeSortVSHybridToFile(e, results, writer);
		} break;
		case TOP3VS:
		{
			writeTop3VsToFile(e, results, writer);
		} break;
		default: break;
		}
	}
	
	/*
	 * writes sort to file
	 */
	static void writeSortToFile(ExpParams e, ArrayList<sortResults> results, String filename) throws IOException
	{
	//creating file
		String fullfilename = filename+".csv";
		FileWriter writer = new FileWriter(fullfilename);
	//writing the results to the file
		writeInfoToFile(e, results, writer);
	//giving the user some feedback about the experiment
		UserFeedBack(results, fullfilename);
		writer.flush();
		writer.close();
	}
}
