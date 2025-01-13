import java.lang.*;
import java.util.*;
class SecondLargest
{
	public static void main(String args[])
	{
			int A[] = { 1,5,2,7,3,4 };
			int max1,max2;
			max1 = max2 = A[0];
			for(int i=0;i<A.length;i++)
			{
				if(A[i]>max1)
				{
					max2 = max1;
					max1 = A[i];
				}
				else if(A[i]>max2)
				{
					max2 = A[i];
				}
			}
			System.out.println("max1 value and max2 value in an array is  :: "+max1+" "+max2);
	}
}
