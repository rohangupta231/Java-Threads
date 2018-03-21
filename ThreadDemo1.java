class ThreadDemo1
{
	public static void main(String dt[])
	{
		Thread t=Thread.currentThread();
		System.out.println("Name"+t.getName());
		System.out.println("Priority"+t.getPriority());
		System.out.println("Groups"+t.getThreadGroup());
		t.setName("DT");
		t.setPriority(10);
		System.out.println("Name "+t.getName());
		System.out.println("Priority "+t.getPriority());
	}
}