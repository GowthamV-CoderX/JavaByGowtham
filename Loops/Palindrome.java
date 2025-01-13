import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sg=new Scanner(System.in);
		int n;
		System.out.println("enter a number :: ");
		n = sg.nextInt();
		int rev=0,r;
		int temp = n;
		while(n>0)
		{
			r = n%10;
			rev = rev*10+r;
			n = n/10;	
		}
		if(temp == rev)
		{
			System.out.println("given number is palindrome ");
		}
		else
		{
			System.out.println("given number is not a palindrome ");
		}
		
	}
}

