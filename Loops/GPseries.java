import java.lang.*;
import java.util.*;
import java.util.Scanner;
class GPseries
{
	public static void main(String args[])
	{
		Scanner sg = new Scanner(System.in);
		int a,n,r;
		System.out.println("enter first term(a) :: ");
		a = sg.nextInt();
		System.out.println("enter common ratio(r) :: ");
		r = sg.nextInt();
		System.out.println("enter number of terms(n) :: ");
		n = sg.nextInt();
		
		int term = a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term = term*r;
		}
		
		
	}
}
