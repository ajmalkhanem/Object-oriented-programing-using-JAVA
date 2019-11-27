package Threads;

public class Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C t=new C();
		t.start();
		
	}
}

class C extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try
		{
			System.out.println("going to sleep"+i);
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("thread running"+i+"time");
		System.out.println(i);
	}
}
}