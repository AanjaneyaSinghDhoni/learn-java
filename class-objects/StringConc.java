class Demo
{	
	String fullname(String fname, String lname)
	{
		return fname+" "+lname;
	}
	
	String replacingValue(String str, char old , char newchar)
	{
		return str.replace(old, newchar);
	}
}

class StringConc
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		System.out.println("ans is :  "+d.fullname("Aanjaneya","Singh Dhoni"));
		String s = d.replacingValue("poor",'o','e');
		System.out.println("the replaced string is :"+s);
	}
}