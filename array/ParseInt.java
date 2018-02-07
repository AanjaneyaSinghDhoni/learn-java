class ParseInt
{
	public static void main(String args[])
	{
		int len = args.length;
		int sum=0;
		if(len==0)
			System.out.println("No arguments passed");
		else
			for(int i=0;i<len;i++)
			{
				sum = sum + Integer.parseInt(args[i]);
			}
			System.out.println("---------------------\nSum :"+sum );
	}
}