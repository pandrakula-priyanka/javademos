package JavaPrograms;

public class NonstaticDemos {
	public NonstaticDemos()
	{
		System.out.println("nonstatic constructor");
	}
	{
		System.out.println("NOn static method");
	}
	public static void main(String []args)
	{
		System.out.println("main method");
		NonstaticDemos dm=new NonstaticDemos();
		
	}

}
