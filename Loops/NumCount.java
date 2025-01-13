import java.lang.*;
import java.util.*;
import java.util.Scanner;
class NumCount
{
	public static void main(String args[])
	{
		Scanner sg = new Scanner(System.in);
		int n;
		System.out.println("enter a number for n :: ");
		n = sg.nextInt();
		int count = 0;
		while(n>=0)
		{
			n = n/10;
			count++;
			if(n==0)
			{
				break;
			}
		}
		System.out.println("digit count is :: "+" "+count);
	}
}
