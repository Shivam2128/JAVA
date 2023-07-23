class callref{
private int a=50, b=100;
void display()
{
	callref cf = new callref();
	System.out.print("a="+cf.a+"b="+cf.b);
	Swap(cf);
	System.out.print("a="+cf.a+"b="+cf.b);
}
void Swap(callref ob)
{
	int temp=ob.a;
	ob.a=ob.b;
	ob.b=temp;
}
}
class myclass
{
	public static void main(String args[])
	{
		callref rf =new callref();
		rf.display();
	}
}
