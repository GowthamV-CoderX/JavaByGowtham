import java.lang.*;
import java.util.*;
class DateorNot
{
	public static void main(String args[])
	{
		String str = "32/01/2024";
		System.out.println(str.matches("[01-31]/[01-12]/[0-9]{4}"));
	}
}
