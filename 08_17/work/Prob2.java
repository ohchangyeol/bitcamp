public class Prob2{
	public static void main(String[] args){
		int year =  2010;
		int month = 2;
		int maxDay = 0;
		//윤년1600, 2000, 2400
		//평년1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600

		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			daysOfMonth[month-1] = 29; 
			maxDay=daysOfMonth[month-1];
		}else{
			maxDay=daysOfMonth[month-1];
		}
		//System.out.println( year % 100 != 0);// 100자리만 아니면 ture
		//System.out.println((year % 4 == 0 && year % 100 != 0) + " = 4의 배수 이면서 100의 배수가 아닌 " );
		//System.out.println((year % 400 == 0) + " 400의 배수");//400의 배수일 때만 true
		System.out.println( year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다.");

	}//main of main
}//end of class