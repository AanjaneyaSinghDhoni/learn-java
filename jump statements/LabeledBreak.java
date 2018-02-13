class LabeledBreak
{
	public static void main(String args[])
	{
		a: for(int i =0;i<10;i++)
			{
				for(int j=0;j<5;j++)
				{
					System.out.print(i);
					if(i%3!=0)
					 break a; // it will break the loop where label is place, here out loop is breaked
				}
				System.out.println();
			}
	}
}