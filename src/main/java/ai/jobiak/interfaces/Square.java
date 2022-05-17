package ai.jobiak.interfaces;

import java.util.Scanner;

public class Square implements Shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=sc.nextInt();
		double Area;
		Area=a*a;
		System.out.println("Area of Square : "+Area);
	}
}
