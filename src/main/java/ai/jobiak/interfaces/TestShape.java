package ai.jobiak.interfaces;

public class TestShape
{
	public static void main(String args[])
	{
		Shape obj1= new Circle();
		obj1.area();
		System.out.println("----------------------");
		Shape obj2=new Square();
		obj2.area();
		System.out.println("----------------------");
		Shape obj3=new Rectangle();
		obj3.area();
		System.out.println("----------------------");
		Shape obj4=new Triangle();
		obj4.area();
		System.out.println("----------------------");
	}
}
