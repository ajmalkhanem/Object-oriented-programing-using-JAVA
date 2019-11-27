package Inheritance;

import java.util.Scanner;

public class Heirarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Bell d = new Bell();
		Acer a = new Acer();
		d.about();
		System.out.println("Enter the company Name");
		String n = s.next();
		a.ace(n);
		d.del(n);

	}

}

class laptop {
	void about() {
		System.out.println("Welcome to Digital world");
		System.out.println("Dell");
		System.out.println("Lenovo");
		System.out.println("Acer");
	}
}

class Acer extends laptop {
	void ace(String dd) {
		if (dd.equals("acer")) {
			System.out.println("Welcome to Acer Community");
			System.out.println("It is available");
		}
	}
}

class Bell extends laptop {
	void del(String dd) {

		if (dd.equals("dell")) {
			System.out.println("Welcome to Dell Community");
			System.out.println("It is available");

		}
	}
}
