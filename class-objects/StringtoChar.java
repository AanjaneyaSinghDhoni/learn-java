class StringHello
{
	char[] Sta(String str)
	{
		char c[] = str.toCharArray();
		return c;
	}
}

class StringtoChar
{	
	public static void main(String args[])
	{
		StringHello d = new StringHello();
		char c[] = d.Sta("Aanjaneya");
		for(char a:c)
		{
			System.out.print (" "+a);
		}
		
	}
}