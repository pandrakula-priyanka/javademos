package inheritencepack;

public class inheritencedemo {

	public static void main(String[] args) {
		//Jdk8 jdk =new Jdk8();
		

	}
}
	class jdk6
	{
		jdk6()
		{
			System.out.println("jdk6..");
		}
	}
	class jdk7 extends jdk6{
		jdk7()
		{
			System.out.println("jdk7...");
		}
	}
	class Jdk8 extends jdk7
	{
		Jdk8()
		{
			System.out.println("jdk8..");
		}
	}

