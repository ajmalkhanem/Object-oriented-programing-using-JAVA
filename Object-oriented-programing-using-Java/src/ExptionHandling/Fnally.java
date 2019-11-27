package ExptionHandling;

public class Fnally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str = "ajmal";
			int a=Integer.parseInt(str);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println(e);

		}
		finally
		{
			System.out.println("this block will definitly run");
		}
	}

}
