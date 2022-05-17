package ai.jobiak.overriding;

public class Rectangle extends Shape
{
	public Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of rectangle : ");
		return d1*d2;
	}
}
