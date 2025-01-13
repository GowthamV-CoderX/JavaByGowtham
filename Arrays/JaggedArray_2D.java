import java.util.Scanner;
class JaggedArray_2D
{
	public static void main(String args[])
	{
		int a[][] = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		a[2][3] = 2;
		for(int x[] : a)
		{
			for(int y : x)
			{
				System.out.print(y+"\t");
			}
			System.out.println("");
		}
		int b[][]={ {0,1},{2,3,4},{5,6,7,8} };
		for(int k[] : b)
		{
			for(int L : k)
			{
				System.out.print(L+"\t");
			}
			System.out.println("");
		}
		
	}
}
