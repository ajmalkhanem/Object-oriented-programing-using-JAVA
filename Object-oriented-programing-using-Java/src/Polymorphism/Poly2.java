package Polymorphism;

import java.util.Scanner;

public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s=new Scanner(System.in);
		StDetails st=new StDetails();
		System.out.println("Ente the Name");
		st.setName(s.next());
		System.out.println("Ente the Id");
		st.setId(s.nextInt());
		System.out.println("Ente the mark1");
		st.setM1(s.nextInt());
		System.out.println("Ente the Mark2");
		st.setM2(s.nextInt());
		System.out.println("Ente the mark3");
		st.setM3(s.nextInt());
		System.out.println("Ente the mark4");
		st.setM4(s.nextInt());
		System.out.println("Ente the mark5");
		st.setM5(s.nextInt());
		st.getdata(st.getName(),st.getId(),st.getM1(),st.getM2(),st.getM3(),st.getM4(),st.getM5());
		st.add(st.getM1(),st.getM2(),st.getM3(),st.getM4(),st.getM5());
		st.add();
		st.rank();
		
	}

}
class Studentt
{
	String name;
	int id;
	int m1,m2,m3,m4,m5;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	
	void getdata(String n,int i,int mr1,int mr2,int mr3,int mr4,int mr5)
	
	{
		System.out.println("Name"+n);
		System.out.println("id"+n);
		System.out.println("Mark 1: "+mr1);
		System.out.println("Mark 2: "+mr2);
		System.out.println("Mark 3: "+mr3);
		System.out.println("Mark 4: "+mr4);
		System.out.println("Mark 5: "+mr5);
		
	}
	
	
}
class StDetails extends Studentt
{
int tot=0;
float avg;
	public void add(int m1, int m2, int m3, int m4, int m5) {
		// TODO Auto-generated method stub
		tot=m1+m2+m3+m4+m5;
		System.out.println("total:"+tot);
	}

	

	public void add() {
		// TODO Auto-generated method stub
		avg=tot/5;
		System.out.println("Average:"+avg);
	}
	public void rank() {
		// TODO Auto-generated method stub
		if(avg>100)
		{
			System.out.println("1");
			
		}
		else
		{
			System.out.println("fails");
		}
			
	}
	
}

