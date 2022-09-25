class P6
{
	public static void main(String[] args)
	{
	 for(int i=1;i<=5;i++) 
		{
		 for(int j=4;j>=i;j--) // space count keep on decreasing from 4 to 0
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	// * count keeps on increasing from 1 to 5
			}
			System.out.println();
			
			
		}
	}
}