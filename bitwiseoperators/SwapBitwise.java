import java.lang.*;
import java.util.*;
class SwapBitwise
{
	public static void main(String args[])
	{
		int a=9,b=12;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("value of a is : "+a+" "+"value of b is :: "+b);
	}
}
