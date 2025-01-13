import java.lang.*;
import java.util.*;
import java.util.Scanner;
class RytAngleTriArea
{
	public static void main(String args[])
	{
		float base,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter triangle base and height : ");
		base = sc.nextFloat();
		height = sc.nextFloat();
		area = (1.0f/2.0f)*base*height;
		System.out.println("area is : " + area+"cm2");
	}
}
