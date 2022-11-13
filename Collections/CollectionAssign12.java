import java.util.*;

class CollectionAssign12
{
	/*static void display(LinkedList<Integer> list)
	{
		for(int s : list)
		{
			System.out.println(s);
		}
	}*/

	public static void main(String args[])
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		boolean check = list1.contains(1);
		System.out.println("Check for 1 containing in the list : "+check);
		check = list1.contains(7);
		System.out.println("Check for 7 containing in the list : "+check);
				
	}	
}	