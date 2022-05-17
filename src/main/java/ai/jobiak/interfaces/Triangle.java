package ai.jobiak.interfaces;

import java.util.Scanner;

public class Triangle implements Shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value :");
		int b=sc.nextInt();
		System.out.println("Enter height value :");
		int h=sc.nextInt();
		double Area;
		Area=(b*h)/2;
		System.out.println("Area of Triangle : "+Area);
	}
}
