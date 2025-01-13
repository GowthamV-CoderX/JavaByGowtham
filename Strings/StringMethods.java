import java.lang.*;
import java.util.*;
class StringMethods
{
	public static void main(String args[])
	{
		String str = "www.abcd.org";
		boolean str2 = str.startsWith("www");
		System.out.println(str2);
		boolean str3 = str.endsWith("org");
		System.out.println(str3);
		char str4 = str.charAt(7);
		System.out.println(str4);
		int l = str.indexOf("o",6);
		System.out.println(l);
		int k = str.indexOf("$");
		System.out.println(k);
		int s = str.lastIndexOf(".");
		System.out.println(s);
		
	}
}
