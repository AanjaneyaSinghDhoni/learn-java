class NestedIfElse
{
	public static void main(String args[])
	{
		int i = (int)(Math.random()*100);
		int j = (int)(Math.random()*100);
		int k = (int)(Math.random()*100);
		System.out.println(i+" "+j+" "+k);
		
		if(i>j)
		{
			if(i>k)
				System.out.println(i+" is greatest.");
			else 
				System.out.println(k+" is greatest.");
		}
		
		else
		{
			if(j>k)
				System.out.println(j+" is greatest.");
			else
				System.out.println(k+" is the greatest.");
		}
	}
}