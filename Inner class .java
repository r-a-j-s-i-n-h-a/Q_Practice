class Outer
{
	public void display()
	{
		System.out.println("I Am Outer Class");
	}
	class Inner
	{
		public void display()
		{
			System.out.println("I Am Inner Class");
		}
	}
}
class outerInner
{
	public static void main(String args[])
	{
		Outer obj1 = new Outer();
		obj1.display();
		Outer.Inner obj2 = obj1.new Inner();
		obj2.display();
	}
}
