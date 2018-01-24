class TypeCasting1
{
	public static void main(String args[])
	{
		long l = 100;  	//even it is 64 bit , it will be stored in 32 bit float value
		float f = l;
		System.out.println(f);
	}
}