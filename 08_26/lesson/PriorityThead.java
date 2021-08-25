/*
	FileName : PriorityThead.java

	::Thread �켱 ���� ����
*/
public class PriorityThead extends Thread
{
	///Field
	private String name;
	///Constructor
	public PriorityThead(){
	}
	public PriorityThead(String name){
		this.name = name;
	}
	///Method
	public void run(){
		for (int i = 0; i < 3; i++)
			System.out.println(name + "���");
	}
	public String getThreadName(){
		return name;
	}

	///Main method
	public static void main(String[] args){
		PriorityThead p1, p2, p3;

		p1 = new PriorityThead("1. �켱���� MAX");
		p2 = new PriorityThead("2. �켱���� NORM");
		p3 = new PriorityThead("3. �켱���� MIN");

		p1.setPriority(Thread.MAX_PRIORITY);
		//p1.setPriority(8);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);

		System.out.println(":: Main Thread 1EA");

		//��¼����� Ȯ������.(p1, p2, p3, or p3, p2, p1) ????
		p3.start();
		p2.start();
		p1.start();
		System.out.println("::Main Thread 1EA + Thread 3EA");

		System.out.println("::" + p1.getThreadName() + "thread�� �켱 ���� : " + p1.getPriority());
		System.out.println("::" + p2.getThreadName() + "thread�� �켱 ���� : " + p2.getPriority());
		System.out.println("::" + p3.getThreadName() + "thread�� �켱 ���� : " + p3.getPriority());
		
	}//end of main
}//end of class

