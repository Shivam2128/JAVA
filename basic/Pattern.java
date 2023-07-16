class Pattern
{
	public static void main(String[] args)
	{
		int a[][]=new int [5][];
		for(int i=0;i<5;i++)
		{
			a[i]=new int[i+1];
	    }
	    for(int i=0;i<5;i++)
	    {
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=(j+1);
		    }
	    }
	    for(int i=0;i<5;i++)
	    {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
}