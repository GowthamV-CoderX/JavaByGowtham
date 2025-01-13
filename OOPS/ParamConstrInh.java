class Rectangle
{
	int length;
	int breadth;
	Rectangle()
	{
		 length = breadth = 1;
		 System.out.println("non param rectangle() called");
	}
	Rectangle(int l,int b)
	{
		length=l;
		breadth = b;
		System.out.println("param rectangle() called");
	}
}
class Cuboid extends Rectangle
{
	int height;
	Cuboid()
	{
		height = height;
		System.out.println("cuboid non param called");
	}
	Cuboid(int h)
	{
		height = h;
		System.out.println("cuboid param called");
	} 
	int volume()
	{
		System.out.println("volume() called");
		return (length)*(breadth)*(height);
	}

}
public class ParamConstrInh
{
	public static void main(String args[])
	{
		Cuboid c = new Cuboid(5);
		System.out.println(c.volume());
		//Rectangle d = new Rectangle(2,3);
		//System.out.println(d.length);
	}
}



