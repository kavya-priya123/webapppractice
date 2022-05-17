package ai.jobiak.Multipleinheritance;

public class TestClass 
{
	public static void main(String[] args) 
	{
		I1 obj1=new C();
		obj1.m1();
		I2 obj2=new C();
		obj2.m1();
		obj2.m2();
		obj1.m1();
		I3 obj3=new C();
		obj3.m1();
		obj3.m2();
		obj3.m3();
		obj2.m2();
		obj2.m1();
		obj1.m1();
	}
}
