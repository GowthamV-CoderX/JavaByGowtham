import java.lang.*;
import java.util.*;
import java.util.Scanner;
class Outer
{
	public void display()
	{
		class Inner
		{
			public void show()
			{
				System.out.println("hello");
			}
		}
		Inner i = new Inner();
		i.show();
		new Inner().show();//without reference we can access
	}
}
class LocalInnerclass
{
	public static void main(String args[])
	{
		Outer O = new Outer();
		O.display();
	}
}
