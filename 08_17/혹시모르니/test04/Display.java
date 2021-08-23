//package jb05.part05.test04;

abstract class BusCharge {
	///Field
	String section;
	
	//Constructor
	public BusCharge() {
	}

	public BusCharge(String section) {
		this.section = section;
	}

	public void information() {
		System.out.println("������� �ȳ�");
	}

//	public void charge() {
//		System.out.println("�л�:300, �Ϲ���:500, ���:��¥");
//	}
	public abstract void charge();
}

class Student extends BusCharge {
	public Student() {
		super ("�л�");
	}

	public void charge() {
		System.out.println(" 300��\n");
	}
}

class Adult extends BusCharge {
	public Adult() {
		super("�Ϲ���");
	}

	public void charge() {
		System.out.println(" 500��\n");
	}
}

class Old extends BusCharge {
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println(" ��¥\n");
	}
}

public class Display {
	public static void main(String args[]) {
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
		
		System.out.println("=================================\n");
		
		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for (int i=0; i<bc.length; i++) {
			bc[i].information();
			System.out.print(bc[i].section);
			bc[i].charge();
		}
	}
}