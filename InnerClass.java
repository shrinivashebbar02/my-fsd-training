package class05;

class outer
{
	int m=100;
	
	void display()
	{
		System.out.println("m: "+m);
	}
	
	class inner
	{
		int n=200;
		
		void doStuff()
		{
			outer.this.display(); // Accessing the outer method from inner method
			System.out.println("m: "+m+" n:"+n);
		}
	}
	
	
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.inner innerObj= new outer().new inner();
		outer outerObj = new outer();
		innerObj.doStuff();	
		outerObj.display();
	}

}
