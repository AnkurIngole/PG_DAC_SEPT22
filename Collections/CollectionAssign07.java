import java.util.*;

class CollectionAssign07
{
	/*static void display(ArrayList<Integer> list)
	{
		for(int s : list)
		{
			System.out.println(s);
		}
	}*/

	public static void main(String args[])
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		for (int i = 0; i < list1.size(); i++)
			System.out.println("Value at Index "+i+" is "+list1.get(i));
		 
				
	}	
}	