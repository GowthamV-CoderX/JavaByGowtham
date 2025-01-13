import java.lang.*;
import java.util.*;
import java.util.Scanner;
class SumOfN
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value for n :: ");
		n = sc.nextInt();
		int sum =0;
		for(int i=0;i<=n;i++)
		{
			sum = sum + i;
		}
		System.out.println("sum of"+" "+n+" "+"numbers is ::"+ sum);
	}
}
