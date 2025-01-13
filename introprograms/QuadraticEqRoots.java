import java.lang.*;
import java.util.*;
import java.util.Scanner;
class QuadraticEqRoots
{
	public static void main(String args[])
	{
		int a,b,c;
		double r1,r2;
		Scanner k=new Scanner(System.in);
		System.out.println("enter a,b,c values : ");
		a = k.nextInt();
		b = k.nextInt();
		c = k.nextInt();
		//System.out.println("a,b and c values are : "+a+" "+b+" "+c);
		//int d = b*b-4*a*c
		r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("roots of Quadratic Equation are : r1 = " + r1 + " and r2 = " + r2);
	}
}
