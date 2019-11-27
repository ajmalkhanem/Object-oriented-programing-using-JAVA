package Inheritance;
import java.util.Scanner;
public class Details {
	
	Scanner s=new Scanner(System.in);
	String name,c,clg;
	int rl,m1,m2,m3,tot,avg;
	public void getDetails()
	
	{
		 System.out.println("Profile Details");
		 System.out.println("------------");
		 System.out.println("Enter your name");
		 name=s.next();
		 System.out.println("Enter your Roll Number");
		 rl=s.nextInt();
		 System.out.println("Enter your Course");
		 c=s.next();
		 System.out.println("Enter your Colege");
		 clg=s.next();
		
	}
	
	public void markDetails()
	{
		System.out.println("Academic Details");
		System.out.println("------------");
		System.out.println("Enter your Maths Mark ");
		m1=s.nextInt();
		System.out.println("Enter your Physics Marks");
		m2=s.nextInt();
		System.out.println("Enter your Chemistry Marks");
		m3=s.nextInt();
		tot=m1+m2+m3;
		avg=tot/3;
		
	}
  public void display()
   {
	System.out.println("Your Profile");
	System.out.println("------------");
	System.out.println("Name       :"+name);
	System.out.println("Roll Number:"+rl);
	System.out.println("Course     :"+c);
	System.out.println("College    :"+clg);
	System.out.println();
	System.out.println("Academic Profile");
	System.out.println("-----------");
	System.out.println("Maths      :"+m1);
	System.out.println("Physics    :"+m2);
	System.out.println("Chemistry  :"+m3);
	System.out.println("Total      :"+tot);
	System.out.println("Average    :"+avg);
	
}
}
