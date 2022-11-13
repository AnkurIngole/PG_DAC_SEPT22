import java.util.*;

class CollectionAssign14
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
		System.out.println("List Before Repalcement : ");		
		display(list1);
		list1.set(1,"Pink");
		System.out.println("List After Repalcement of Blue with Pink");
		display(list1);
	}	
}	