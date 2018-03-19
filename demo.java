class out
{
	static int x=10;
	int y=20;
static class in
{
	void meth()
	{
		System.out.println(x);
	}
}
}
class demo
{
	public static void main(String args[])
	{
		out.in ob1 = new out.in();
		ob1.meth();
	}
}