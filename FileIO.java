import java.io.IOException;
import java.util.Scanner;

public class FileIO
{
	/*
	 * Main Menu
	 * The whole program is run through this method
	 */
	public static void MainMenu() throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which of the following do you want to run/test?");
		System.out.println("(enter the number corresponding to your choice)");
		System.out.println("1. Unit Tests");
		System.out.println("2. Experiments");
		System.out.println("3. Sort Methods");
		int a = scanner.nextInt();
		while(a < 1 || a > 3)
		{
			System.out.println("Please enter a valid value");
			System.out.println("1 to run unit tests,");
			System.out.println("2 to run experiments, or");
			System.out.println("3 to run a sort method");
			a = scanner.nextInt();
		}
	//Runs the menus for the different options
		switch(a)
		{
		case 1:
		{
			FileIOUnitTestMenu.UnitTestMenu();
		} break;
		case 2:
		{
			FileIOExperimentMenu.ExperimentMenu();
		} break;
		case 3: 
		{
			FileIOSortMenu.SortMenu();
		} break;
		default: break;
		}
		scanner.close();
	}
}
