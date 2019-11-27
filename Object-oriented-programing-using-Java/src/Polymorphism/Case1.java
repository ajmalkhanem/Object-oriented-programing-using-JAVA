package Polymorphism;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		Car c=new Car();
		Bike b=new Bike();
		
		System.out.println("1.Bike\n2.car");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Ente the Color");
			b.setColor(s.next());
			System.out.println("Ente the Speed");
			b.setSpeed(s.nextInt());
			System.out.println("Ente the seat");
			b.setSeat(s.nextInt());
			System.out.println("Ente the wheel");
			b.setWeel(s.nextInt());
			System.out.println("Ente the break");
			b.setDisk(s.next());
			b.display();
			break;
		case 2:
			System.out.println("Ente the Color");
			c.setColor(s.next());
			System.out.println("Ente the Speed");
			c.setSpeed(s.nextInt());
			System.out.println("Ente the seat");
			c.setSeat(s.nextInt());
			System.out.println("Ente the wheel");
			c.setWeel(s.nextInt());
			System.out.println("Ente the AC");
			c.setAc(s.next());
		    c.display();
			break;
			
		case 3:
			System.out.println("invalid option");
			break;
		}
		
		
	}

}
class Vehicle
{
	String color,disk,ac;
	int speed,seat,weel;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getWeel() {
		return weel;
	}
	public void setWeel(int weel) {
		this.weel = weel;
	}
	
	
	
}

class Bike extends Vehicle
{
	void display()
	{    
		System.out.println("Bike details");
		System.out.println("Color :"+color);
		System.out.println("Speed :"+speed);
		System.out.println("Seat :"+seat);
		System.out.println("Wheel :"+weel);
		System.out.println("Disk break :"+disk);
	}
}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("car details");
		System.out.println("Color :"+color);
		System.out.println("Speed :"+speed);
		System.out.println("Seat :"+seat);
		System.out.println("Wheel :"+weel);
		System.out.println("AC :"+ac);
	}
}