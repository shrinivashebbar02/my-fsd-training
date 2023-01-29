package class05;

interface Shape
{
	void draw();
	default void fill()
	{
		System.out.println("Filling");
	}
}

class Circle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape s = new Shape(); error
		Shape s = new Circle();
		s.draw();
		s.fill();
	}

}
