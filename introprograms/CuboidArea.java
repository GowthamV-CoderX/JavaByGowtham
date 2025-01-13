import java.lang.*;
import java.util.*;
import java.util.Scanner;
class CuboidArea
{
	public static void main(String args[])
	{
		float length,breadth,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length,breadth and height values : ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		height = sc.nextFloat();
		float area = 2*(length*breadth + breadth*height + height*length);
		float volume = length*breadth*height;
		System.out.println("area is : " + area + " volume is : " + volume);
	}
}
