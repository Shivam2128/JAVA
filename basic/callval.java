class test
{
	private int a=50,b=100;
	void display()
	{
		System.out.print("a="+a+"b="+b);
		Swap (a,b);
		System.out.print("a="+a+"b="+b);
	}
	void Swap(int a,int b)
	{
		int temp;
		temp =a;
		b=temp;
	}
}
class callval{
	public static void main(String args[])
	{
		test ob =new test();
		ob.display();
	}
}