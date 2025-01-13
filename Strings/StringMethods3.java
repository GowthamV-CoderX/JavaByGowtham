import java.lang.*;
import java.util.*;
class StringMethods3
{
	public static void main(String args[])
	{
		String str1 = "JAVA";
		String str2 = "java";
		String str3 = "java";
		String str10 = "jython";
		boolean str7 = str2.equals(str1);
		System.out.println(str7);
		boolean str6 = str2.equals(str3);
		System.out.println(str6);
		boolean str5 = str1.equalsIgnoreCase(str3);
		System.out.println(str5);
		int l = str2.compareTo(str10);
		System.out.println(l);
		String str4=new String("java");
		boolean str11 = str4.equals(str2);
		System.out.println(str11);
		if(str11==str2)
		System.out.println("(true)");
	}
}
