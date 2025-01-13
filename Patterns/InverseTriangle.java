import java.lang.*;
import java.util.*;
import java.util.Scanner;
class InverseTriangle
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<=3;k++)
			{
				if(i==4)
				{
					System.out.print(" ");
				}
				else if(i+k<=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
