import java.util.Scanner;
class MulMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Demention of arrays : ");
			int n = sc.nextInt();
			int arr1[][] = new int[n][n];
			int arr2[][] = new int[n][n];
			int arr3[][] = new int[n][n];
		System.out.println("Enter the Matrix 1 :");
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr1[i][j] = sc.nextInt();

		System.out.println("Enter the Matrix 2 :");

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr2[i][j] = sc.nextInt();
				
		System.out.println("###Multiplication###");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					arr3[i][j]=arr3[i][j] + arr1[i][k]*arr2[k][j];
				}
				System.out.print("  "+arr3[i][j]);
			}
			System.out.println("");
		}
		sc.close();
	}

}