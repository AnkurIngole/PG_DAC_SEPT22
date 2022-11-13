import java.util.*;

class CollectionAssign06
{
	static void display(ArrayList<Integer> list)
	{
		for(int s : list)
		{
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("ArrayList before Swapping : ");	
		display(list1);
		Collections.swap(list1,1,2);
		System.out.println("ArrayList After Swapping index 1 and 2 : ");
		display(list1);
		
				
	}	
}	