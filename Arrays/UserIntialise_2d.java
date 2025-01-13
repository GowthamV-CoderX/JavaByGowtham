import java.util.Scanner;
class UserIntialise_2d
{
	public static void main(String args[])
	{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("enter array row size :: ");
		int row = input1.nextInt();
		System.out.println("enter array coloumn size :: ");
		int coloumn = input2.nextInt();
		int A[][] = new int[row][coloumn];
		System.out.println("enter array elements :: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				A[i][j]=input1.nextInt();
			}
		}
		System.out.println("array elements are :: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}

