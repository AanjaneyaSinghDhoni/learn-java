class Demo
{
	int a, b;
}
class Demo1
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj);  //it will give the address where obj is pointing
		obj.a=10;
		obj.b=20;
		System.out.println(obj.a+obj.b);
	} 
}