import java.lang.*;
import java.util.*;
import java.util.Scanner;
class MultTable
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number for n :: ");
		n = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	
}
