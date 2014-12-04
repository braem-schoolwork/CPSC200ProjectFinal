/*
 * Every sort class must include:
 * A method to sort
 * A method to initialize the object
 * A method to return the information in the object
 */
interface Sort
{
	void sort(sortParams sParams);

	void initialize(sortParams s);

	sortParams getSortParams();
}
