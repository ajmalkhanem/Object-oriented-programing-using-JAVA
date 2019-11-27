package Polymorphism;

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AB obj=new AB();
		obj.disp();
		A obj1=new A();
		obj1.disp();
	}

}

class A
{
	void disp()
	{
		System.out.println("Hai parent");
	}
}
class AB extends A
{
	void disp()
	{
		System.out.println("Hai child");
	}
}