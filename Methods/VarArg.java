import java.lang.*;
class VarArg
{
	static void print(int y,int...x)
	{
		System.out.println(y);
		for(int a : x)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String args[])
	{
		print(1,2,3,4,5,6,7);
	}
}
