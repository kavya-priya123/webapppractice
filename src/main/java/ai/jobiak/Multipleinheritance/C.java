package ai.jobiak.Multipleinheritance;
interface I1
{
	void m1();
}
interface I2 extends I1
{
	void m2();
}
interface I3 extends I2
{
	void m3();
}
public class C implements I3
{
	public void m1()
	{
		System.out.println("Hello1");
	}
	public void m2() 
	{
		System.out.println("Hello2");
	}
	public void m3()
	{
		System.out.println("Hello3");
	}
}
