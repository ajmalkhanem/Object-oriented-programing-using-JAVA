package ExptionHandling;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=33/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
	}

}
