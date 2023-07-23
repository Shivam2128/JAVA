class test{
private int a,b;
void getdata(int a,int b)
{
	this.a=a;
	this.b=b;
}
void display()
{
	System.out.print("a="+a+"b="+b);
}
}
class demo
{
	public static void main(String args[])
	{
		test t1 = new test();
		t1.getdata(40,100);
		int c = a+b;
		t1.display();
		System.out.print("result is: "+c);
	}
}