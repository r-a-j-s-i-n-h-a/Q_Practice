class stringbufferexample
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Programming");

		//System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println("\n\n----------\n\n");
		
		sb1.reverse();
		System.out.println(sb1);
	}
}
