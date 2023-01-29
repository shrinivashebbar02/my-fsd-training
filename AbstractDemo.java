package class05;

abstract class Vehicle
{
	abstract void drive();
	
	void applybreak()
	{
		System.out.println("Applying Break");
	}
}

class Car extends Vehicle
{

	@Override // Overridden method
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving a Car");
	}
	
	void changeGear()
	{
		System.out.println("Changing Gear");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vehicle v= new Vehicle(); // Error cannot create for abstract 
		Vehicle v= new Car();
		v.drive();
		// v.changeGear(); only can call overridden methods 
		v.applybreak();
		Car c= new Car();
		c.changeGear();
	}

}
