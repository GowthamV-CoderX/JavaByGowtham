import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int fact = 1;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value for n :: ");
		n = s.nextInt();
		for(int i =1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of a "+" "+n+" "+"is :: "+fact);
	}
}
