import java.lang.*;
import java.util.*;
import java.util.Scanner;
class ReverseNum
{
	public static void main(String args[])
	{
		Scanner sg=new Scanner(System.in);
		int n;
		System.out.println("enter a number :: ");
		n = sg.nextInt();
		int rev=0,r;
		while(n>0)
		{
			r = n%10;
			rev = rev*10+r;
			n = n/10;	
		}
		System.out.println("reverse number is :: "+rev);
		
	}
}

