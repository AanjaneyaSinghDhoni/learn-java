import java.util.Scanner;

class CheckAlpha
{	
	public static void main(String args[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char:");
		ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("it is an Alphabet.");
		else
			System.out.println("it is not an Alphabet.");
			
		sc.close();
		
	}
}