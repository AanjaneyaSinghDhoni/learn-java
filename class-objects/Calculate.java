class Calculate
{
	void sum(double a, double b)
	{	
		System.out.println("the sum is :"+(a+b));
	}
	
	void mul(double a, double b)
	{
		System.out.println("the multiplication is : "+a*b);
	}
}
class Calc
{
	public static void main(String args[])
	{
		Calculate c = new Calculate();
		c.sum(2,3);
		c.mul(2,3);
	}
}