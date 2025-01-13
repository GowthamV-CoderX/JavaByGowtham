import java.lang.*;
import java.util.*;
class VarMax
{
	static int max(int...A)
	{
		if(A.length==0) 
			return Integer.MIN_VALUE;
		else
		{
			int max = A[0];
			for(int i=0;i<A.length;i++)
			{
				if(A[i]>max)max=A[i];
			}
			return max;
		}
		
	}
	public static void main(String args[])
	{
		System.out.println(max());
		System.out.println(max(23,43,32,23,21,442,2352,3));
		System.out.println(max(3));
	}
}
