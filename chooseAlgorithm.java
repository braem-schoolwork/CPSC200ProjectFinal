
public abstract class chooseAlgorithm
{
	/*
	 * chooses the sort algorithm used based on experiment
	 */
	static Sort chooseSortAlgo(Sort sorter, ExpParams e)
	{
		switch(e.getSortType())
		{
		case SELECTION:
		{
			sorter = new SelectionSort();
		} break;
		case INSERTION:
		{
			sorter = new InsertionSort();
		} break;
		case SHELL:
		{
			sorter = new ShellSort();
		} break;
		case MERGE:
		{
			sorter = new MergeSort();
		} break;
		case MERGEHYBRID:
		{
			sorter = new MergeSortHybrid();
		} break;
		case QUICK:
		{
			sorter = new QuickSort();
		} break;
		case QUICKHYBRID:
		{
			sorter = new QuickSortHybrid();
		} break;
		default:
		{
			sorter = null;
		} break;
		}
		return sorter;
	}
}
