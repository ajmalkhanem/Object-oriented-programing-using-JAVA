package Inheritance;
import java.util.Scanner;

public class SingleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Dell d=new Dell();
		d.about();
		System.out.println("Enter the company Name");
		String n=s.next();
		d.kilo(n);

	}

}
class Laptops
{
	void about()
	{
		System.out.println("Welcome to Digital world");
		System.out.println("Dell");
		System.out.println("Lenovo");
		System.out.println("Acer");
	}
}
class Dell extends Laptops
{
	void kilo(String dd)
	{
		if(dd.equals("dell"))
		{
		System.out.println("It is available");
	}
		if(dd.equals("hp"))
		{
		System.out.println("It is not available");
	}
		if(dd.equals("lenovo"))
		{
		System.out.println("It is available");
	}
}
}