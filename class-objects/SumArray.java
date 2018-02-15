class Demo
{
	int sumAll(int arr[])
	{
		int sum = 0;
		for(int a:arr)
		{
			sum = sum + a;
		}
		return sum;
	}
}

class SumArray
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		//int arr[] = {1,2,3,4,5,6,7};
		int sum = d.sumAll(new int[]{1,2,3,4,5});  //sum of array by passing anonymous array
		System.out.print(" "+sum);
	}
	
}