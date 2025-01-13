import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Test
{
	public int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	public int max(int a,int b,int c)
	{
		if(a>b && a<c) return a;
		else return (b>c)?b:c;
	}
}
public class OverloadPolymorphism
{
	public static void main(String args[])
	{
		Test t = new Test();
		System.out.println(t.max(1,2));
		System.out.println(t.max(3,5,2));
	}
}
