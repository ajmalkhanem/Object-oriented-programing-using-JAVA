package Encapsulation;

import java.util.Scanner;

public class Encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Customer cs = new Customer();
		do {
			System.out.println("registration");
			System.out.println("Enter the name");
			cs.setName(s.next());
			System.out.println("Enter the Address");
			cs.setAdd(s.next());
			System.out.println("Enter the Contact");
			cs.setContact(s.next());
			System.out.println("Enter the email");
			cs.setEmail(s.next());
			System.out.println("Enter the type");
			cs.setType(s.next());
			System.out.println("Enter the id");
			cs.setId(s.next());

			if (cs.getAdd() == null) {
				System.out.println("invalid Address");
			}
			if (cs.getName() == null) {
				System.out.println("invalid name");
			}
			if (cs.getContact() == null) {
				System.out.println("invalid name");
			}
			if (cs.getEmail() == null) {
				System.out.println("invalid Email");
			}
			if (cs.getId() == null) {
				System.out.println("invalid id");
			} 
		} while (cs.getAdd() == null || cs.getName() == null || cs.getEmail() == null || cs.getContact() == null);

		if (cs.getAdd() != null && cs.getName() != null && cs.getContact() != null && cs.getEmail() != null) {
			 
			System.out.println("Thank you Registration Successful");
			cs.Register(cs.getName(), cs.getAdd(), cs.getContact(), cs.getEmail(), cs.getType(), cs.getId());

		}
	}
}

class Customer {
	String name;
	String add;
	String contact;
	String email;
	String type;
	String id;

	public String getName() {
		return name;
	}

	public void Register(String name2, String add2, String contact2, String email2, String type2, String id2) {
		// TODO Auto-generated method stub
		System.out.println(name2);
		System.out.println(add2);
		System.out.println(contact2);
		System.out.println(email2);
		System.out.println(type2);
		System.out.println(id2);
	}

	public boolean setName(String name) {
		if (name.matches("[A-Z][a-z]*")) {
			this.name = name;
			return true;
		} else {

			return false;
		}
	}

	public String getAdd() {
		return add;
	}

	public boolean setAdd(String add) {
		if (add.matches("[A-Z][a-z]*")) {
			this.add = add;
			return true;
		} else {

			return false;

		}
	}

	public String getContact() {
		return contact;
	}

	public boolean setContact(String contact) {
		if (contact.matches("^[0-9]*$")) {
			this.contact = contact;
			return true;
		} else {

			return false;
		}
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {

		if (email.contains("@")) {
			this.email = email;
			return true;
		} else {

			return false;
		}
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

	public boolean setId(String id) {
		if (id.matches("^[0-9]*$")) {
			this.id = id;
			return true;
		} else {

			return false;

		}
	}
}