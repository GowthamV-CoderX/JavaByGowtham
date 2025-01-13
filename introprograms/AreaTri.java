import java.lang.*;
import java.util.Scanner;
import java.util.*;
class AreaTri
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a , b and c values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		float s;
		s = (a+b+c)/2f;
		double area;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of triangle is : "+area+"cm2");
	}
}
