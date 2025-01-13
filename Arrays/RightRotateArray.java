import java.lang.*;
import java.util.*;
class RightRotateArray
{
	public static void main(String args[])
	{
		int A[] = {2,3,4,5,6,7,8,9};
		for(int x : A)
		{
			System.out.print(x+",");
		}
		System.out.println("");
		int temp = A[A.length-1];
		for(int i=0;i<A.length;i++)
		{
			A[i+1] = A[i];
		}
		A[0] = temp;
		for(int x : A)
		{
			System.out.print(x+",");
		}
		
	}
}
