class BooleanOperator2
{
	public static void main(String args[])
	{
		boolean a = true;
		if(a=false) 	//condition inside if is false
			System.out.println("hi");
		else
			System.out.println("bye");	 // this staement will execute
		
		a = true;
		if(a==false)	 //this condition is again false
			System.out.println("hi");
		else
			System.out.println("bye");	 //this statement will execute
	}
}