class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("Thread 1");
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("Thread 2");
		}
	}
}
class ThreadDemo2
{
	public static void main(String dt[]) 
	{	
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 obj=new Thread2();
		Thread t2=new Thread(obj);
		t2.start();
		for(int i=0;i<=100;i++)
		{
			System.out.println("Main Thread");
		}
	}
}