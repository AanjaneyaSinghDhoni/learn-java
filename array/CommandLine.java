class CommandLine
{
	public static void main(String args[])
	{
		int len = args.length;
		System.out.println("The length of the Command line Array is :"+len);
		if(len==0)
			System.out.println("No arguments passed.");
		
		else
			for(int i=0;i<len;i++)
			{
				System.out.print(" "+args[i]);
			}
	}
}