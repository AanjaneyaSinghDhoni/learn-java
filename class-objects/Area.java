class Room
{
	double length, breadth, height;
	void setValues(double l, double b , double h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	void area()
	{
		System.out.println("the area is : "+(length*breadth));
	}
	void volume()
	{
		System.out.println("this is the volume  : "+(length*breadth*height));
	}
}

class Area
{
	public static void main(String args[])
	{
		Room r = new Room();
		r.setValues(10,10,10);
		r.area();
		r.volume();
	}
	
	
	
}