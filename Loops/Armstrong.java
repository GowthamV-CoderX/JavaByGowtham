import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sg = new Scanner(System.in);
		int n;
		System.out.println("enter a number for n ::");
		n = sg.nextInt();
		int d;
		int sum=0;
		int temp = n;
		while(n>0)
		{
			d = n%10;
			sum = sum + d*d*d;
			n = n/10;
		}
		n = temp;
		if(sum==n)
		{
			
			System.out.println(n+" "+"is armstrong number");
		}
		else
		{
			System.out.println(n+" "+"is not a armstrong number");
		}
	}
}
