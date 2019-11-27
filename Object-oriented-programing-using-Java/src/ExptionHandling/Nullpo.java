package ExptionHandling;

public class Nullpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str =null;
			int a=str.length();
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println(e+" String is empty");

		}
	}

}
