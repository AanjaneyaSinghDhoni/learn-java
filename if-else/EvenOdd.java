/*check even odd */
import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.print("this number is even.");
		}
		
		else
		{
			System.out.print("this number is odd");
		}	
		
		sc.close();
		
	}
}