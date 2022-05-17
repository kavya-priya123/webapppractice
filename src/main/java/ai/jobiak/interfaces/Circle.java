package ai.jobiak.interfaces;

import java.util.Scanner;

public class Circle implements Shape
{
	public void area() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value :");
		double r=sc.nextDouble();
		double Area;
		Area=PI*r*r;
		System.out.println("Area of a Circle : "+Area);
	}
}
