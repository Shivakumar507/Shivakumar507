package Com.oops;

public class Vehicle {
	public void vTest()
	{
		System.out.println("Vehicle test method");
	}
}

class Car extends Vehicle
{
	int speed=40;
	public void cTest()
	{
		System.out.println("Car test method");
	}
}

class Bus extends Vehicle
{
	int speed=30;
	public void bTest()
	{
		System.out.println("Bus test method");
	}
}



