import java.lang.*;
import java.util.*;
import java.util.Scanner;
class UserInitialise_1D
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter size :: ");
		int size = input.nextInt();
		int a[] = new int[size];
		System.out.println("enter elements to an array a :: ");
		for(int i=0;i<size;i++)
		{
			a[i] = input.nextInt();
		}
		System.out.print("array elements are :: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}
