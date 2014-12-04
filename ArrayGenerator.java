import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
 * Contains method to generate an array to be sorted, using helper methods
 * abstract because this class should never be instantiated
 */
public abstract class ArrayGenerator
{
	/*
	 * helper methods
	 */
		//generates a random array
	static int[] genRandomArray(int ArrSize)
	{
		int[] array = new int[ArrSize];
		Random r = new Random();
		int rNum;
		for(int i = 0; i < ArrSize; i++)
		{
			rNum = r.nextInt(Integer.MAX_VALUE);
			array[i] = rNum;
		}
		return array;
	}
		//generates an array sorted in the reverse order
	static int[] genReverseSortedArray(ExpParams e)
	{
	//needs to be an Integer value to use built in reverse sort
		Integer[] array = new Integer[e.getArrSize()];
	//creates a random array
		Random r = new Random();
		int rNum;
		for(int i = 0; i < e.getArrSize(); i++)
		{
			rNum = r.nextInt(Integer.MAX_VALUE);
			array[i] = rNum;
		}
	//if the sort direction is ascending, we need to sort in the reverse order
		if(e.getSortDirection() == Direction.ASCENDING)
		{
			Arrays.sort(array, Collections.reverseOrder());
		}
		else
		{
			Arrays.sort(array);
		}
	//need to convert Integer array to int array
		int arr[] = new int[e.getArrSize()];
		for (int i = 0; i < array.length; i++)  
	    {  
	      arr[i] = array[i];
	    }  
		return arr;
	}
		//generates an array of only 5 different values
		//0, 1, 2, 3, or 4
	static int[] gen5DistinctValueArray(int ArrSize)
	{
		int[] array = new int[ArrSize];
		Random r = new Random();
		int rNum;
		for(int i = 0; i < ArrSize; i++)
		{
			rNum = r.nextInt(5);
			array[i] = rNum;
		}
		return array;
	}
	
	/*
	 * Main decider method
	 */
	public static int[] genArray(ExpParams eParams)
	{
		int[] array;
		switch(eParams.getGenArrayType())
		{
		case RANDOM:
			{
				array = genRandomArray(eParams.getArrSize());
			} break;
		case REVERSESORTED:
			{
			//reverse sorting depends on the direction so pass whole ExpParams
				array = genReverseSortedArray(eParams);
			} break;
		case FIVEDISTINCTVALUES:
			{
			array = gen5DistinctValueArray(eParams.getArrSize());
			} break;
		default:
			{
				array = genRandomArray(eParams.getArrSize());
			} break;
		}
		return array;
	}
}
