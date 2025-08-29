import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		
		int prod = 1;
		for(int i = 1; i<= n; i++)
		{
			prod = prod * i;
		}
		System.out.println("Factorial:"+ prod);
	}
}
