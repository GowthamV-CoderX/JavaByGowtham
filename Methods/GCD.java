import java.lang.*;
import java.util.*;
import java.util.Scanner;
class GCD
{
	static int gcdoftwo(int n,int p)
	{
		int gcd=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && p%i==0)
			{
				gcd=i;
				//count++;
			}
			/*else 
			{
				gcd = 1;
			}*/
		}
		return gcd;
		/*if(count>=2)
		{
			return gcd;
		}
		else
		{
			return 1;
		}*/
		
	}
	public static void main(String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers for a and b :: ");
		a = s.nextInt();
		b= s.nextInt();
		int k = gcdoftwo(a,b);
		System.out.println("gcd of "+a+" "+"and"+" "+b+" "+"is : "+" "+k);
		
	}
}
