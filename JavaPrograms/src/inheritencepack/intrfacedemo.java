package inheritencepack;

public class intrfacedemo {

	public static void main(String[] args) {
		A obj=new A();
		obj.get();
		obj.stop();

	}

}
interface bmw
{
	void get();
	void stop();
}
class A implements bmw
{
	public void get()
	{
		System.out.println("gettingstarted");
	}
	public void stop()
	{
		System.out.println("stopped");
	}
}