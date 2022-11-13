import java.util.*;

class CollectionAssign10
{
	static void display(LinkedList<Integer> list)
	{
		for(int s : list)
		{
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("LinkedList before Inserion  : ");	
		display(list1);
		list1.addFirst(5);
		list1.addLast(6);
		System.out.println("LinkedList After Insertion ");
		display(list1);
		
				
	}	
}	