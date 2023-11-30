package Thread;

public class DemoExample implements Runnable
{
	@Override
	public void run() {
		System.out.println("hai");
		
	}

	public static void main(String[] args) {
		DemoExample d=new DemoExample();
		Thread t=new Thread(d);
		t.start();

	}

	

}
