package Inheritance;

import java.util.Scanner;

public class RoomBook {

public static void main(String[] args) {
	
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
Booking b = new Booking();
//String c[]=new String[25];
int i=1;

//register();

String pro,p,sr;

do {
	b.register();
	 System.out.println("Do you want to proceed book ");
     pro = s.next();
     switch(pro)
     {
     case "No":
    	 b.display1();
    	 break;
     }
if(pro.equals("yes")==true)
{
	do
	{ 
		b.book();
	System.out.println("Do you want to register again ");
		p = s.next();
		switch(p)
		{
		case "yes":
			b.register();
			do {
			    b.book();
				System.out.println("Do you want to proceed book ");
			    
			    sr = s.next();
			}while(sr.equals("yes"));
			if(sr.equals("no")==true)
			{
				b.display();
			}
		
			break;
		case "not":
			b.display();
			break;
		}
		
      
    
	}while(p.equals("no"));
	
} 
i++;

}while(pro.equals("no"));

}
}



