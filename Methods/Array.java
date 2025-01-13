import java.lang.*;
import java.util.*;
class Array
{
	static void change(int x[],int index,int value)
	{
		x[index] = value;
	}
	public static void main(String args[])
	{
		int a[] = { 1,2,3,4,5,6,7,8 };
		for(int X : a)
		{
			System.out.print(X+" ");
		}
		System.out.println("");
		change(a,4,27);
		for(int X : a)
		{
			System.out.print(X+" ");
		}
	}
	
}
