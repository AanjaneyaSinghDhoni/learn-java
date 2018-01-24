class TypeCasting3
{
	public static void main(String args[])
	{
		byte b = 10;
		//b=b+2; //this is wrong because byte get type promotion to integer, hence the type casting of RHS is important
		b = (byte)(b+2);
		System.out.println(b);		
	}
}