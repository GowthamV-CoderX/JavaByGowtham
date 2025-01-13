import java.util.Scanner;
class arrayIntro_2D
{
	public static void main(String args[])
	{
		int a[][] = { {1,2,3},{4,5,6},{7,8,9} };
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		for(int x[] : a)
		{
			for(int y : x)
			{
				System.out.print(y+"\t");
			}
			System.out.println("");
		}
	}
}
