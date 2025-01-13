import java.util.Scanner;
class DifferenceofMatrix
{
	public static void main(String args[])
	{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("enter row1 size for array A :: ");
		int row1 = input1.nextInt();
		System.out.println("enter coloumn1 size for array A :: ");
		int coloumn1 = input2.nextInt();
		int A[][]=new int[row1][coloumn1];
		
		System.out.println("enter matrix elements for array A :: ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<coloumn1;j++)
			{
				A[i][j] = input2.nextInt();
			}
		}
		
		System.out.println("matrix elements of array A :: ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<coloumn1;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("enter row2 size for array B :: ");
		int row2 = input1.nextInt();
		System.out.println("enter coloumn2 size for array B :: ");
		int coloumn2 = input2.nextInt();
		int B[][]=new int[row2][coloumn2];
		
		System.out.println("enter matrix elements for array B :: ");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<coloumn2;j++)
			{
				B[i][j] = input2.nextInt();
			}
		}
		
		System.out.println("matrix elements of array B :: ");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<coloumn2;j++)
			{
				System.out.print(B[i][j]+"\t");
			}
			System.out.println("");
		}
		
		if(row1 == row2 && coloumn1 == coloumn2)
		{
			System.out.println("matrix subtraction is possible ::");
			int C[][] = new int[row1][coloumn1];
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<coloumn1;j++)
				{
					C[i][j] = A[i][j] - B[i][j];
					System.out.print(C[i][j]+"\t");
				}
				System.out.println("");
			}
			
			
			
			
		}
		else
		{
			System.out.println("matrix subtraction is not possible");	
		}
		
		
	}
}
