package Inheritance;
import java.util.Scanner;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Del d=new Del();
		d.about();
		d.lapt();
		System.out.println("Enter the company Name");
		String n=s.next();
		d.laps(n);

	}

}
class Electronic
{
	void about()
	{
		System.out.println("Welcome to Digital world");
	}
}

class Lapto extends Electronic
{
	void lapt()
	{
		
		System.out.println("laptops");
		
}
}
class Del extends Lapto
{
	
	void laps(String dd)
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