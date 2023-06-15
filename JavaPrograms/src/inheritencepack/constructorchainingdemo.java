package inheritencepack;

public class constructorchainingdemo {

	public static void main(String[] args) {
		childclass cl=new childclass();

	}

}
class superclass
{

	superclass()
	{
		System.out.println("no parentclass argument");
	}
	superclass(int x)
	{
		System.out.println("one parentclass argument");
	}
}
class childclass extends superclass
{
	childclass()
	{
		this(20);
		System.out.println("no childclass argument");
	}
	childclass(int y)
	{
		super(y);
		System.out.println("one childclasss argment");
	}
}
