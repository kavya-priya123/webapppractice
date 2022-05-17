package ai.jobiak.interfaces;

public class TestAnimal
{
	public static void main(String[] args)
	{
		Animal obj1=new Cat();
		obj1.Eating();
		obj1.Barking();
		System.out.println("-----------------");
		Animal obj2=new Lion();
		obj2.Eating();
		obj2.Barking();
	}
}
