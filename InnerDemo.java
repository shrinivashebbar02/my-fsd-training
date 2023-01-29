package class05;

class outerClass
{
	String msg="Shree Ram";
	void display()
	{
		class innerClass
		{
			void msg()
			{
				int i=0;
				while(i<10)
					{
					System.out.println(msg);
					i++;
					}
			}
		}
		innerClass inObj = new innerClass();
		inObj.msg();
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass outObj= new outerClass();
		outObj.display();
	}

}
