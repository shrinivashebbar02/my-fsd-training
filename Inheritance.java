package class05;

class Base
{
	int i,j;
	void inputIJ (int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	void displayIJ()
	{
		System.out.println("i: "+ i + " j: "+j);
	}
}

class Derived extends Base
{
	int k;
	void inputK(int k)
	{
		this.k=k;
	}
	void displayK()
	{
		System.out.println("k: "+k);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b= new Base(); // b.i =0, b.j=0
		b.inputIJ(10, 20);
		b.displayIJ(); // i=10,j=20
		
		Derived d= new Derived(); // d.i=0, d.j=0, d.k=0
		d.inputIJ(100, 200); 
		d.inputK(300);
		d.displayIJ();
		d.displayK();
	}

}

