import java.util.*;

class CollectionAssign13
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
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		String check = "";
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		list2.add(1);
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(5);
		
		list3.add(15);
		list3.add(45);
		list3.add(12);
		list3.add(65);
		list3.add(56);
		
		System.out.print("List1 and List 2 are ");
		for(int num : list1)
		{
			check = (list2.contains(num) ? "Identical" : "Non Identical");
		}
		System.out.print(check);
		
		System.out.println();
		System.out.print("List1 and List 3 are ");
		for(int num : list1)
		{
			check = (list3.contains(num) ? "Identical" : "Non Identical");
		}
		System.out.print(check);
		
	}	
}	
 
 
 
 