import java.lang.*;
import java.util.*;
class RemoveExtraSpace
{
	public static void main(String args[])
	{
		String str = "   abc    def    ghi    jkl   ";
		System.out.println(str);
		str = str.replaceAll("\\s+"," ").trim();
		System.out.println(str);
		String words[]=str.split("\\s");
		System.out.println(words.length);
	}
}
