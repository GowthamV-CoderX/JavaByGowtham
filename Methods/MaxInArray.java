import java.lang.*;
import java.util.*;
class MaxInArray
{
	static int Max_element(int x[])
	{
		int max = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max = x[i];
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		int a[]={1,5,2,3,7,9,6};
		int k = Max_element(a);
		System.out.println("max element in an array is :: "+k);
	}
}
