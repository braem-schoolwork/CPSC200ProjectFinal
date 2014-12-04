import java.util.ArrayList;
import java.util.Collections;

/*
 * Contains a method to generate a gap sequence using helper methods
 */
public abstract class GapSeqGenerator
{
	/*
	 * methods for generating a shell, pratt, or knuth gap sequence
	 */
		//shell
	static ArrayList<Integer> genShellGapSeq(int arraySize)
	{
		ArrayList<Integer> gapSeq = new ArrayList<Integer>();
		int i = 1;
		do
		{
			gapSeq.add(arraySize/((int)Math.pow(2,i)));
			++i;
		} while((int)Math.pow(2,i) < arraySize);
	//when arraySize == 2^k for k = 1, 2, 3, ....., infinity,
	//this gap sequence will not have a 1 at the end, hence we remove the last
	//member of the gap sequence iff it is a 1, then add 1 to the end right after
		if(gapSeq.get(gapSeq.size()-1) == 1)
		{
			gapSeq.remove(gapSeq.size()-1);
		}
		gapSeq.add(1);
		return gapSeq;
	}
		//knuth
	static ArrayList<Integer> genKnuthGapSeq(int arraySize)
	{
		ArrayList<Integer> gapSeq = new ArrayList<Integer>();
		int i = 1;
		do
		{
			gapSeq.add((int)(Math.pow(3, i)-1)/2);
			++i;
		} while((Math.pow(3, i)-1)/2 < arraySize/3);
		Collections.reverse(gapSeq);
		return gapSeq;
	}
		//tokuda
	static ArrayList<Integer> genTokudaGapSeq(int arraySize)
	{
		ArrayList<Integer> gapSeq = new ArrayList<Integer>();
		int i = 1;
		double tokudaAlgo;
		do
		{
			tokudaAlgo = (Math.pow(9, i)-Math.pow(4, i))/(5*Math.pow(4, i-1));
			gapSeq.add((int)tokudaAlgo+1);
			++i;
		} while(tokudaAlgo < arraySize);
		gapSeq.set(0, 1);
		gapSeq.remove(gapSeq.size()-1);
		Collections.reverse(gapSeq);
		return gapSeq;
	}
	
	/*
	 * method for generating a gap sequence
	 */
	public static ArrayList<Integer> generateGapSeq(sortParams sParams)
	{
		int arraySize = sParams.getArrSize();
		ArrayList<Integer> array;
		switch(sParams.getGapSeqType())
		{
			case SHELL:
			{
				array = genShellGapSeq(arraySize);
			} break;
			case TOKUDA:
			{
				array = genTokudaGapSeq(arraySize);
			} break;
			case KNUTH:
			{
				array = genKnuthGapSeq(arraySize);
			} break;
			default: 
			{
			//defaults to shell gap sequence
				array = genShellGapSeq(arraySize);
			} break;
		}
		return array;
	}
}
