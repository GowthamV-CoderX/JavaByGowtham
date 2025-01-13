import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Rectangle
{
	public int perimeter(int a,int c)
	{
		return 2*(a+c);
	}
	public int area(int x,int y)
	{
		return x*y;
	}
	public static void main(String args[])
	{
		System.out.println("enter length :: ");
		System.out.println("enter breadth :: ");
		Rectangle l = new Rectangle();
		Rectangle b = new Rectangle();
		l.Rectangle = 5;
		b.Rectangle = 4;
		//int length = l.nextInt();
		//int breadth = b.nextInt();
		System.out.println(perimeter(length,breadth));
		System.out.println(area(length,breadth));
		
	}
}
