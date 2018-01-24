class ShortCircuitOperator
{
	public static void main(String args[])
	{
			int a = 10;
			if (a == 10 || ((a = 20) == 20)) //if first condition is true second will not execute in OR
			{
				System.out.println(a);
			}
			System.out.println(a);
			
			int b = 20;
			if(b==10 && ((b=10) == 10)) // if the first condition is false the second condition will not be checked
				System.out.println(b);
				
				System.out.println(b);
	}
}