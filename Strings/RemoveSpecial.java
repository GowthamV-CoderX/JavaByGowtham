import java.lang.*;
import java.util.*;
class RemoveSpecial
{
	public static void main(String args[])
	{
		String str = "a!@$bcD%";
		str = str.replaceAll("[^0-9a-zA-Z]","");
		System.out.println(str);
	}
}
