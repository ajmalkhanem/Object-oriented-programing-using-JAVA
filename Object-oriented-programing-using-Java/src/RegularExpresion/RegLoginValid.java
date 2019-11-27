package RegularExpresion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegLoginValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		
		
		String firstName = "[A-Z][a-z]*";
		String lastName  =  "[A-Z]+([ '-][a-zA-Z]+)*";
		String regemail="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  //pattern for user name
		String regpassword="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";  
		String reva="[0-9]*";
		String yer="^\\d{4}$";
		String dpp="[A-Z][.][a-z]*";
		int f=0,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
		System.out.println("Enter first name");
		String name=s.next();
		Pattern nam=Pattern.compile(firstName);      //checking username pattern
		Matcher m2=nam.matcher(name);
		
		if(m2.matches())                       //user name valid or not
		{
			System.out.println("valid name");
			f=1;
		}
		else
		{
			System.out.println("invalid name");
			f=0;
		}
		 
		System.out.println("Enter last name");
		String namel=s.next();
		Pattern naml=Pattern.compile(lastName);      //checking username pattern
		Matcher m0=naml.matcher(namel);
		
		if(m2.matches())                       //user name valid or not
		{
			System.out.println("valid lastname");
			f1=1;
		}
		else
		{
			System.out.println("invalid lastname");
			f1=0;
			
		}
		
		System.out.println("Enter email");
		String email=s.next();
		Pattern em=Pattern.compile(regemail);      //checking username pattern
		Matcher m1=em.matcher(email);
		
		if(m1.matches())                       //user name valid or not
		{
			System.out.println("valid email");
			f2=1;
		}
		else
		{
			System.out.println("invalid email");
			f2=0;
			}
		
		System.out.println("Enter reg no:");
		String regid=s.next();
		Pattern id=Pattern.compile(reva);      //checking username pattern
		Matcher m3=id.matcher(regid);
		
		if(m3.matches())                       //user name valid or not
		{
			System.out.println("valid regid");
			f3=1;
		}
		else
		{
			System.out.println("invalid regid");
			f3=0;
			
		}
		
		System.out.println("Enter the rank");
		String rank=s.next();
		Pattern ran=Pattern.compile(reva);      //checking username pattern
		Matcher m4=ran.matcher(rank);
		
		if(m4.matches())                       //user name valid or not
		{
			System.out.println("valid rank");
			f4=1;
		}
		else
		{
			System.out.println("invalid rank");
			f4=0;
		}
		
		System.out.println("Enter the year");
		String year=s.next();
		Pattern yr=Pattern.compile(yer);      //checking username pattern
		Matcher m5=yr.matcher(year);
		
		if(m5.matches())                       //user name valid or not
		{
			System.out.println("valid year");
			f5=1;
		}
		else
		{
			System.out.println("invalid year");
			f5=0;
		}
		
		System.out.println("Enter the department");
		String dep=s.next();
		Pattern de=Pattern.compile(dpp);      //checking username pattern
		Matcher m6=de.matcher(dep);
		
		if(m6.matches())                       //user name valid or not
		{
			System.out.println("valid dep");
			f6=1;
		}
		else
		{
			System.out.println("invalid dep");
			f6=0;
		}
		
		//if(m0.matches()&&m1.matches()&&m2.matches()&&m3.matches()&&m4.matches()&&m5.matches()&&m0.matches())
		if(f==1 && f1==1 && f2==1 && f3==1 && f4==1 && f5==1 && f6==1)
		{
		
			String regus="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  //pattern for user name
			String regpas="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";                                                        //pattern for password
			int u=0,pw=0;
			System.out.println("Enter username");
			String username=s.next();
			Pattern us=Pattern.compile(regus);      //checking username pattern
			Matcher mm=us.matcher(username);
			if(username.contentEquals(email))
			{
			if(mm.matches())                       //user name valid or not
			{
				System.out.println("valid userid");
				u=1;
			}
			else
			{
				System.out.println("invalid userid");
				u=0;
			}}
			else
			{
				System.out.println("incorrect username");
				System.exit(0);
			}
			
			
			System.out.println("Enter password");
			String password=s.next();
			Pattern psw=Pattern.compile(regpas);    //checking password pattern
			Matcher mmm=psw.matcher(password);
			if(mmm.matches())           //password is valid or not
			{
				System.out.println("valid password");
				pw=1;
			}
			else
			{
				System.out.println("invalid password");
				pw=0;
			}
			
			if(u==1 && pw==1)
			{
				System.out.println("login Sucess");
			}
			else
			{
				System.out.println("invalid login");
			}

		}
		else
		{
			System.out.println("invalid registarion");
		}
		
		
		

	}

}
