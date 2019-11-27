package Polymorphism;

import java.util.Scanner;

public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		Add a=new Add();
		System.out.println("Enter the first number");
		a.setN1(s.nextInt());
		System.out.println("Enter the second number");
		a.setN2(s.nextInt());
		System.out.println("Enter the third number");
		a.setN3(s.nextInt());
		a.add(a.getN1(),a.getN2());
		a.add(a.getN1(),a.getN2(),a.getN3());

	}

}

class Add
{
	int n1,n2,n3;

	public int getN1() {
		return n1;
	}

	public void add(int n12, int n22, int n32) {
		// TODO Auto-generated method stub
		int sum=n12+n22+n32;
		System.out.println("sum of three numbers is"+sum);
		
	}

	public void add(int n12, int n22) {
		// TODO Auto-generated method stub
		int sum=n12+n22;
		System.out.println("sum of two numbers is"+sum);
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
	
}