package ai.jobiak.overriding;

public class Areas
{
	public static void main(String args[])
	{
		//Shape obj=new Shape(5,6);
		//System.out.println("Area is : "+obj.area());
		Rectangle obj1=new Rectangle(3,7);
		System.out.println(obj1.area());
		Triangle obj2=new Triangle(2,4);
		System.out.println(obj2.area());
	}
}
