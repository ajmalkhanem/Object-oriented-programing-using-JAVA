package Polymorphism;

public class OverideSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABa obj=new ABa();
		obj.disp();
			}

}

class Aa
{
	void disp()
	{
		System.out.println("Hai parent");
	}
}
class ABa extends Aa
{
	void disp()
	{
		super.disp();
		System.out.println("Hai child");
	}
}
	


