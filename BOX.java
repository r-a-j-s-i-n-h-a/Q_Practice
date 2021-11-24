import java.util.Scanner
class Box
{
	int length,breadth,height;
    	Box(int length, int breadth, int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
    	}
}
class Box3d extends Box
{
	Box3d(int length, int breadth, int height)
	{
		super(length, breadth, height);
    	}
	public void area()
	{
		System.out.println(2*(length*breadth+length*height+height*breadth));
	}
	public void volume()
	{
		System.out.println(length*breadth*height);
	}
}
class BoxMain
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
		Box3d obj = new Box3d(a,b,c);
        	obj.area();
        	obj.volume();
        }
}
