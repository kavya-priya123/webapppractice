package ai.jobiak.Hybridinheritance;

public class Class1 implements Interface4
{
	public void m1() 
	{
		System.out.println("Method of Interface1");
		int a=3,b=5;
		System.out.println("Addition : "+(a+b));
		System.out.println("--------------------------");
	}
	public void m2() 
	{
		System.out.println("Method of Interface2");
		int a=9,b=4;
		System.out.println("Multiplication : "+(a*b));
		System.out.println("--------------------------");
	}
	public void m3()
	{
		System.out.println("Method of Interface3");
		int a=25,b=7;
		System.out.println("Division : "+(a/b));
		System.out.println("--------------------------");
	}
	public void m4()
	{
		System.out.println("Method of Interface4");
		int a=18,b=4;
		System.out.println("Modulo Division : "+(a%b));
		System.out.println("--------------------------");
	}
}
