class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread 1");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{	
			}
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread 2");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class ThreadDemo3
{
	public static void main(String dt[]) //Important!!! Dhayan sa dekhn
	{	
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 obj=new Thread2();
		Thread t2=new Thread(obj);
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
		}
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println("Main Thread");
		}
	}
}