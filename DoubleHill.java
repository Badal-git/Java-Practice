class  DoubleHill
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 1; i < n; i++)
		{
			//upper part
			for(int j = i; j < n-1; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j < i; j++)
			{
				System.out.print("* ");					// Perfect Double Hill (made changes to space for loops 
			}											//running them less times solved the problem
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			for(int j = i; j < n-1; j++)
			{
				System.out.print("  ");
			}
			
			for(int j = i; j < n-1; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j < i; j++)
			{
				System.out.print("* ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
