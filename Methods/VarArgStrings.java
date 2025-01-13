import java.lang.*;
import java.util.*;
class VarArgStrings
{
	static void ShowList(int start,String...S)
	{
		for(int i=0;i<S.length;i++)
		{
			System.out.println(i+1+"."+S[i]);
		}
		for(int i=0;i<S.length;i++)
		{
			System.out.println(start+1+"."+S[i]);
			start++;
		}
	}
	public static void main(String args[])
	{
		ShowList(4,"pandu","gowtham","shyam");
	}
}
