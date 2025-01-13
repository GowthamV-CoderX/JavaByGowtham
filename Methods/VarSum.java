import java.lang.*;
import java.util.*;
class VarSum
{
	static int sum(int...A)
	{
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum = sum + A[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println(sum());
		System.out.println(sum(45,5,36,3));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println(sum(1,4,2));		
	}
}
