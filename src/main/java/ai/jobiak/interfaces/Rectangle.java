package ai.jobiak.interfaces;

import java.util.Scanner;

public class Rectangle implements Shape 
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length value :");
		int l=sc.nextInt();
		System.out.println("Enter width value :");
		int w=sc.nextInt();
		int Area;
		Area=l*w;
		System.out.println("Area of Rectangle : "+Area);
	}
}
