package inheritencepack;

public class vehicledemo {

	public static void main(String[] args) {
		
		bike bk=new bike();
		

	}

}
class vehicle
{
	int a,b;
	vehicle(a,b)
	{
		this.a=a;
		this.b=b;
	}
	
}
class bike extends vehicle
{
	int c;
	int d;
	bike(int a,int b,int c,int d)
	{
		super(a,b);
		this.c=c;
		this.d=d;
		
	}
}

