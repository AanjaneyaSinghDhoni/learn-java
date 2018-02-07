import java.util.Scanner;
class Arry
{
	public static void main(String args[])
	{
		int arr[]= new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}