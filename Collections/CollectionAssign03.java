import java.util.*;

class CollectionAssign03
{
	static void display(List<String> list)
	{
		for(String s : list)
		{
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		List <String> list1 = new ArrayList<String>();

		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Yellow");
				
		display(list1);
		
		System.out.println("Retrieving element at 3rd position :"+list1.get(3));
		System.out.println("Retrieving element at 2nd position :"+list1.get(2));
				
	}	
}	