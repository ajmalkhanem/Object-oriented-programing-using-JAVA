package Polymorphism;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		TeleBill b=new TeleBill();
			System.out.println("Ente the telphone bill number");
			b.setTelno(s.nextInt());
			System.out.println("Ente the customer name ");
			b.setName1(s.next());
			System.out.println("Ente the number of calls made");
			b.setNc(s.nextInt());
			System.out.println("Ente the cost per call");
			b.setCpc(s.nextInt());
			System.out.println("Ente the current bill number");
			b.setCb(s.nextInt());
			System.out.println("Ente the name");
			b.setName2(s.next());
			System.out.println("Ente the number of units");
			b.setUnit(s.nextInt());
			System.out.println("Ente the cost per unit");
			b.setCu(s.nextInt());
			
			b.display(b.getTelno(),b.getName1(),b.getNc());
			b.display(b.getCb(),b.getName2(),b.getUnit());
		
		
	}

}
class Bill
{
	String name1,name2;
	int telno,nc,cb,unit;
	float cpc,cu;
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public int getTelno() {
		return telno;
	}
	public void setTelno(int telno) {
		this.telno = telno;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	public int getCb() {
		return cb;
	}
	public void setCb(int cb) {
		this.cb = cb;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public float getCpc() {
		return cpc;
	}
	public void setCpc(float cpc) {
		this.cpc = cpc;
	}
	public float getCu() {
		return cu;
	}
	public void setCu(float cu) {
		this.cu = cu;
	}
	
}

class TeleBill extends Bill
{
	

	public void display(int telno, String name1, int nc) {
		// TODO Auto-generated method stub
		System.out.println("tele details");
		System.out.println("Color :"+telno);
		System.out.println("Speed :"+name1);
		System.out.println("Seat :"+nc);
		System.out.println("Wheel :"+cpc);
		
	}
}
class CurrentBill extends Bill
{
	public void display(int telno, String name1, int nc, int ccpd) {
		// TODO Auto-generated method stub
		System.out.println("current details");
		System.out.println("Color :"+telno);
		System.out.println("Speed :"+name1);
		System.out.println("Seat :"+nc);
		System.out.println("Wheelw :"+ccpd);
		
	}
	
}