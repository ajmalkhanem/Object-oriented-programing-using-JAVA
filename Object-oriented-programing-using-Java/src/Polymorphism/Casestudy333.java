package Polymorphism;

import java.util.Scanner;

public class Casestudy333 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, i = 1, k = 1;
		Casestudy c = new Casestudy();

		System.out.println("Enter price of ticket");
		c.setPrice(s.nextInt());
		System.out.println("Enter no of person");
		c.setP(s.nextInt());
		a = c.getP();
		double tot=0;
		do {
			System.out.printf("ENTER DETAILS OF PERSON%d\n", i);
			i++;
			System.out.println("Enter name");
			c.setName(s.next());
			System.out.println("Enter gender(F/M)");
			c.setG(s.next());
			if(c.getG().contentEquals("F"))
			{
				tot=c.getPrice()*.10;
			}
			System.out.println("Enter age");
			c.setAge(s.nextInt());
			a--;
		} while (a > 0);
		c.ticket(c.getP(), tot);
		while (k <= c.getP()) {

			double total = c.ticket1(c.getAge(), c.getG(), c.getP(), c.getPrice());

			if (k == c.getP()) {

				System.out.printf("TOTAL AMOUNT=%.1f", total);
				break;
			}
			k++;
		}
	}

}

class Casestudy {

	int price;
	int p;
	int i = 1, j = 0;
	String name;
	String g;
	int age;
	double total = 0, sum = 0;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void ticket(int p, double tot) {
// TODO Auto-generated method stub
		System.out.printf("TICKET DETAILS ARE....\n");
		System.out.printf("NO: OF PASSENGERS:%d\n", p);
		System.out.println( tot);
	}

	double ticket1(int age, String g, int p, int price) {

		j++;
		total = 0;
		double m = .25, o = .10, q = .50;
		if (age < 16) {
			total = (double) sum + (price - (price * q));
			sum = total;
			return total;
		} else if (g.contentEquals("F") == true && age >= 16) {
			total = sum + (price - price * o);
			sum = total;
			return total;
		} else if (age > 64) {
			total = sum + (price - price * m);
			sum = total;
			return total;
		} else {
			total = sum + price;
			sum = total;
			return total;
		}

	}
}