import java.lang.*;
import java.util.*;
class LargestElement
{
	public static void main(String args[])
	{
		int A[] = {5,8,2,9,4,2,1};
		int max = A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max = A[i];
			}
		}
		System.out.println("largest element in an array is : "+max);
		
	}
}
