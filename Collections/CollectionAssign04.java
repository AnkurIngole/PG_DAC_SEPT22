import java.util.*;

class CollectionAssign04
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
		System.out.println("ArrayList before Sorting : ");	
		display(list1);
		Collections.sort(list1);
		System.out.println("ArrayList After Sorting : ");
		display(list1);
		
				
	}	
}	