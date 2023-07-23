class Sum{
private int a,b;
void getdata(int x,int y)
{
	a=x;
	b=y;
}
int max()
{
	if(a>b)
	return a;
else
    return b;
}
}
class Maxsum
{
	public static void main(String args[])
	{
		Sum sm1=new Sum();
		Sum sm2=new Sum();
		sm1.getdata(70,50);
		sm2.getdata(40,80);
		int m1 = sm1.max();
		int m2 =sm2.max();
		int S =m1+m2;
		System.out.print("Result is: "+S);
	}
}
