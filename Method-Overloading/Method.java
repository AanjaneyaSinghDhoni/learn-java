class Calc
{
	void sum(int a, int b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	
	void sum(int a, float b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	void sum(float a, float b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	void sum(double a, double b)
	{
		System.out.println("Sum is : "+(a+b));
	}
}

class Main
{
		public static void main(String args[])
		{
			Calc c = new Calc();
			c.sum(2,3);
			c.sum(2,2.3f);
			c.sum(2.3f,2.3f);
			c.sum(2.3,2.3);
			
		}
}