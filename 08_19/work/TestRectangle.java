import java.util.Scanner;

public class TestRectangle{
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("ù��° ���簢���� ����:");
		rec1.SetColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����:");
		rec1.SetWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����:");
		rec1.SetLength(keyboard.nextInt());
		
		
		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����:");
		rec2.SetColor(keyboard.next());
		
		System.out.println("�ι�° ���簢���� ����:");
		rec2.SetWidth(keyboard.nextInt());
		
		System.out.println("�ι�° ���簢���� ����:");
		rec2.SetLength(keyboard.nextInt());

		System.out.println(rec1.getColor() +"���簢���� ���̴� " + rec1.area() + " �̰� �ѷ��� " + rec1.perimeter()+" �Դϴ�.");
		System.out.println(rec2.getColor() +"���簢���� ���̴� " + rec2.area() + " �̰� �ѷ��� " + rec2.perimeter()+" �Դϴ�.");
		
		//TODO 1
		if (rec1.area()>rec2.area()){
			System.out.println("���̴� "+rec1.getColor() + "���簢���� �� Ů�ϴ�.");
		}else if (rec1.area()<rec2.area()){
			System.out.println("���̴� "+rec2.getColor() + "���簢���� �� Ů�ϴ�.");
		}else{
			System.out.println("���̴� �����ϴ�.");
		}
		//TODO 2
		if (rec1.perimeter()>rec2.perimeter()){
			System.out.println("�ѷ��� "+rec1.getColor() + "���簢���� �� Ů�ϴ�.");
		}else if (rec1.perimeter()<rec2.perimeter()){
			System.out.println("�ѷ��� "+rec2.getColor() + "���簢���� �� Ů�ϴ�.");
		}else{
			System.out.println("�ѷ��� �����ϴ�.");
		}
	}//main
	
	
}//class