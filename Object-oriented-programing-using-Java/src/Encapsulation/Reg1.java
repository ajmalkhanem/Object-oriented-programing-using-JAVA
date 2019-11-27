package Encapsulation;

import java.util.Scanner;

public class Reg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Regs rg=new Regs();
		System.out.println("Enter the name");
		rg.setName(s.next());
		System.out.println("Enter the Address");
		rg.setAdd(s.next());
		System.out.println("Enter the Contact");
		rg.setContact(s.next());
		System.out.println("Enter the email");
		rg.setEmail(s.next());
		System.out.println("Enter the type");
		rg.setType(s.next());
		System.out.println("Enter the id");
		rg.setId(s.next());
		
		//rg.Register(rg.getName(),rg.getAdd(),rg.getContact(),rg.getEmail(),rg.getType(),rg.getId());
        Display ds=new Display();
        ds.disp(rg.getName(),rg.getAdd(),rg.getContact(),rg.getEmail(),rg.getType(),rg.getId());
	}

}
class Display
{

	public void disp(String name, String add, String contact, String email, String type, String id) {
		
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(add);
		System.out.println(contact);
		System.out.println(email);
		System.out.println(email);
		System.out.println(id);
	}
	
}
 
class Regs
{
	String name;
	String add;
	String contact;
	String email;
	String type;
	String id;

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void Register(String string, String string2, String string3, String string4, String string5, String string6)
	{
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
		System.out.println(string5);
		System.out.println(string6);
		
	}
	
}