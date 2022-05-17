package ai.jobiak.overriding;

public class Triangle extends Shape
{
	public Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of Triangle : ");
		return d1*d2/2;
	}
}


