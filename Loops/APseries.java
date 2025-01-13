import java.lang.*;
import java.util.*;
import java.util.Scanner;
class APseries
{
	public static void main(String args[])
	{
		Scanner sg = new Scanner(System.in);
		int a,n,d;
		System.out.println("enter first term(a) :: ");
		a = sg.nextInt();
		System.out.println("enter common difference(d) :: ");
		d = sg.nextInt();
		System.out.println("enter number of terms(n) :: ");
		n = sg.nextInt();
		
		int term = a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term = term + d;
		}
		
		
	}
}
