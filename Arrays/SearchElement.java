import java.lang.*;
import java.util.*;
class SearchElement
{
	public static void main(String args[])
	{
		int A[] = {2,5,3,8,1,7};
		Scanner sg =new Scanner(System.in);
		int key;
		System.out.println("enter a key element :: ");
		key = sg.nextInt();
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==key)
			{
				System.out.println("element found at index : "+i);
				System.exit(0);
				
			}
		}
		System.out.println("element not found ");
	}
}
