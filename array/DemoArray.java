import java.util.Scanner;
class DemoArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
	}
}