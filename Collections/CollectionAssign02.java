import java.util.*;

class CollectionAssign02
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
		System.out.println("ArrayList Before Addition of Pink colour :");
		display(list1);
		
		list1.add(0,"Pink");
		System.out.println("ArrayList After Addition of Pink colour :");
		
		display(list1);
		
		
	}	
}	