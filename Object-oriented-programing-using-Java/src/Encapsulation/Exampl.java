package Encapsulation;

import java.util.Scanner;

public class Exampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the name");
		st.setName(s.next());
		System.out.println("Enter the id");
		st.setId(s.nextInt());
		System.out.println(st.getName());
		System.out.println(st.getId());
		
		
	}

}
