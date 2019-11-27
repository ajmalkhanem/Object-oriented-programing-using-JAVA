package Inheritance;
import java.util.Scanner;
public class Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Roome g=new Roome();
	 g.userdata();
	 g.Rent();
	}

}

class Getdetails
{
	Scanner s=new Scanner(System.in);
	int p,dy;
	double tot,tf;
	String type;
	
	void userdata()
	
	{
		System.out.println("Welcome......!\nBook your Room");
		System.out.println();
		System.out.println("Number of persons");
		p=s.nextInt();
		System.out.println("Number of Days");
		dy=s.nextInt();
		System.out.println("Tarff per day");
		tf=s.nextInt();
		System.out.println("Room Type");
		type=s.next();
	}
}
class Roome extends Getdetails
{
	double tot;
	void Rent()
	{
		tot=p*dy*tf;
		System.out.println("Total Tariff    :"+tot);
	}
}
