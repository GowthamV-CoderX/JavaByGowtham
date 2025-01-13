import java.lang.*;
import java.util.*;
import java.util.Scanner;
class DisplayDigits
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int  n;
		System.out.println("enter a number :: ");
		n = s.nextInt();
		int r;
		while(n>0)
		{
			r = n%10;
			System.out.println(r);
			n = n/10;
		}
	}
}
