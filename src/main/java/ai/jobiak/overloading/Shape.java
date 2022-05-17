package ai.jobiak.overloading;

public class Shape
{

	double d1;
	double d2;

	double area()
	{
		return 0;
	}
	double area(double a,double b)
	{
		System.out.println("Area of rectangle : ");
		return d1*d2;
	}
}
/*public class Test
{
	public static void main(String args[])
	{
		Shape obj=new area(3,5);
	}
}*/
