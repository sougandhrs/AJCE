import java.util.*;

public class Arylist
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		ArrayList<String> cars = new ArrayList<String>();						//cars.add("BMW");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter a car name: ");
			cars.add(sc.next());
		}
		System.out.println(cars);
		System.out.println("Accessing 2nd element: "+cars.get(1));
		System.out.println("Changing 3rd element: ");
		cars.set(2,"Ford");
		System.out.println(cars.get(2));
		System.out.println("Remove 1st element: ");
		cars.remove(0);
		System.out.println("To get the size of the array list: "+cars.size());
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		System.out.println("Sorting the list in Alphabetical order: ");
		Collections.sort(cars);
		System.out.println(cars);
		System.out.println("Sorting the list in Alphabetical order: "+Collections.max(cars));
	}
}
