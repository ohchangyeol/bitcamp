public class Prob2{
	public static void main(String[] args){
		int year =  2010;
		int month = 2;
		int maxDay = 0;
		//����1600, 2000, 2400
		//���1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600

		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			daysOfMonth[month-1] = 29; 
			maxDay=daysOfMonth[month-1];
		}else{
			maxDay=daysOfMonth[month-1];
		}
		//System.out.println( year % 100 != 0);// 100�ڸ��� �ƴϸ� ture
		//System.out.println((year % 4 == 0 && year % 100 != 0) + " = 4�� ��� �̸鼭 100�� ����� �ƴ� " );
		//System.out.println((year % 400 == 0) + " 400�� ���");//400�� ����� ���� true
		System.out.println( year + "�� " + month + "���� ������ " + maxDay + "�� �Դϴ�.");

	}//main of main
}//end of class