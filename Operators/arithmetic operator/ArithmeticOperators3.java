class ArithmeticOperators3
{
	public static void main(String args[])
	{	
		int x = 10; //10
		int y = x++; //10, x++
		System.out.println(x);//11
		System.out.println(y);//10
		
		x = 10;
		y = ++x;
		System.out.println(x);//11
		System.out.println(y);//11
		
		x=10;
		System.out.println(x++ + ++x + ++x - x++);//10 + 12 +13 - 13	
		System.out.println(x);//14
	}	
	
}