//package rishab2;
class out
{
	static int z=50;
	int f=100;
	void methout()
	{
		new in().meth();
	}
	class in
	{
		int y=20;
		
		void meth()
		{
			System.out.println(y);
			System.out.println(z);
			System.out.println(f);

		}
	}
}
class demo1
{
	public static void main(String args[])
	{
		out o=new out();
		//o.methout();
		out.in i=o.new in();
		i.meth();

	}
}