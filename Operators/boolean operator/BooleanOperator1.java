class BooleanOperator1
{
	public static void main(String args[])
	{
		int a = 10;
		if((a=10)==10) 
		//if(a=20) //error int cannot act as boolean
			System.out.println("HI");
		else
			System.out.println("bye");
	}
}