package inheritencepack;

public class methodoveriing {

	public static void main(String[] args) {
		B obj=new B();
		obj.m();
		

	}
	

	
}
class A
{
	void m()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void m()
	{
		super.m();
		System.out.println("class B");
	}
}

