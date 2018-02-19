//parameterised constructor
class Add
{
	Add(int a, int b)
	{
		System.out.println("Sum of a and b :"+(a+b));
	}
}

class Main
{
	public static void main(String args[])
	{
		Add d = new Add(10,20);
	}
}