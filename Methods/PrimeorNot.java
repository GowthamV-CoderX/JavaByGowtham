import java.lang.*;
import java.util.*;
class PrimeorNot
{
	static boolean prime_num(int p)
	{
		int count =0;
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("enter a number for n :: ");
		n = s.nextInt();
		boolean k = prime_num(n);
		if(k)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		
	}
}
