package JavaPrograms;

public class staticblockdemos {

	public static void main(String[] args) {
		System.out.println("main method");
		constructorDemo cd=new constructorDemo();
		System.out.println(cd.nofwheels);
		System.out.println(cd.name);
		
		System.out.println(constructorDemo.manufacurer);
		

	}
	static 
	{
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	

}
