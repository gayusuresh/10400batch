package Thread;

public class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hai");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args) {
		Demo d=new Demo();//thread creation
		d.setName("first");
		System.out.println(d.getName());
		d.start();
		try
		{
			d.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Demo d1=new Demo();//thread creation
		d1.setName("second");
		System.out.println(d1.getName());
		d1.start();
		

	}

}
