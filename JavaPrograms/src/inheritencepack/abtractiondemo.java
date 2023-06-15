package inheritencepack;

public class abtractiondemo {

	public static void main(String[] args) {
		
		bmwthreeseries series=new bmwthreeseries();
		series.accelerate();
		series.start();
		BMW ser=new bmwfiveseries();
		ser.accelerate();
		ser.start();
	}

}
abstract class BMW
{
	void start()
	{
		System.out.println("just now started");
	}
	abstract void accelerate();
}
class bmwthreeseries extends BMW
{
	void accelerate()
	{
		System.out.println("three series ");
	}
}
class bmwfiveseries extends BMW
{
	void accelerate()
	{
		System.out.println("five series");
	}
}
