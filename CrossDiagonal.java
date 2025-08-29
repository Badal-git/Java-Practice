class CrossDiagonal 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == j || i+j == n+1)  
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


// visualize it with i and j values and we will see left diag i and j value is same and 
//right diag i val and j val adds up to n +1