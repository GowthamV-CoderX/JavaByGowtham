import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sg = new Scanner(System.in);
		int a,b,c;
		int n;
		System.out.println("enter no.of terms for Fibonacci series :: ");
		n = sg.nextInt();
		a=0;
		b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int i=1;
		while(i<=(n-2))
		{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			i++;
		}
		
	}
}
