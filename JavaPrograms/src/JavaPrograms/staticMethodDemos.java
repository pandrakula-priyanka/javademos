package JavaPrograms;

public class staticMethodDemos {

	public static void main(String[] args) {

		System.out.println("main method");
		m1();
		m2();
		staticMethodDemos m3=new staticMethodDemos();
		m3.nonstaticmethod();

		
	}
	
	public static void  m1()
	{
		System.out.println("static method1");
	}
	public static void  m2()
	{
		System.out.println("static method2");
	}
	public void nonstaticmethod()
	{
		System.out.println("nonstatic method1");
	}
	

}
