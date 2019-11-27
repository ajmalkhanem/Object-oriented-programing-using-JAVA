package ExptionHandling;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str = "ajmal";
			int a=Integer.parseInt(str);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println(e+" String is not converted to intger");

		}
	}

}
