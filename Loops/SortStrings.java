import java.lang.*;
import java.util.*;
class SortStrings
{
	public static void main(String args[])
	{
		String arr[] = { "python","java","html","css","javascript" };
		java.util.Arrays.sort(arr);
		for(String x : arr)
		{
			System.out.println(x);
		}
		
		int a[] = { 4,7,5,8,2,1,9,3 };
		for(int p : a)
		System.out.print(p+" ");
		System.out.println("");
		
		java.util.Arrays.sort(a);
		for(int y : a)
		{
			System.out.print(y+" ");
		}
	}
}
