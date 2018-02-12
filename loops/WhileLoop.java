import java.util.Scanner;
class WhileLoop
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		
		while(sc.hasNextInt())
		{
			int i = sc.nextInt();
			System.out.println("Entered integer is "+i);
			System.out.print("Enter the next value. ");
		}
		sc.close();
		
	}
}