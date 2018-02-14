class Room1
{
	double area(double a,double b)
	{
		return(a*b);
	}
	double volume(double a,double b,double c)
	{
		return(a*b*c);
	}
}

class Area1
{
	public static void main(String args[])
	{
		Room1 r1 = new Room1();
		double area = r1.area(10,10);
		double volume = r1.volume(10,10,10);
		System.out.println("area is :"+area+"  volume is : "+volume );
	}
}