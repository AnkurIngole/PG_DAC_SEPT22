import java.util.*;

class CollectionAssign05
{
	static void display(ArrayList<Integer> list)
	{
		for(int s : list)
		{
			System.out.println(s);
		}
	}
	
	 public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list1)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = list1.size() - 1; i >= 0; i--) 
		{
			revArrayList.add(list1.get(i));
        }
		
		return revArrayList;
	}

	public static void main(String args[])
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("ArrayList before Reversing : ");	
		display(list1);
		list2 = reverseArrayList(list1);
		System.out.println("ArrayList After Reversing : ");
		display(list2);
		
				
	}	
}	