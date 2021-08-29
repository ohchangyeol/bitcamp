package ex3;
import java.util.Vector;

// 문자열 배열의 내용을 역순으로 출력하되 각 문자열또한 역순으로 출력한다.

public class Prob1 {
	//Field
	StringBuffer temp ; 
	Vector<String> newVector ;
	
	// Constructor
	public Prob1() {
		temp =new StringBuffer();
		newVector =new Vector<String>();
	}

	// method - reverse 없이 반복문 활용
	public Vector<String> dataChange (String[] strData){
		for(int i = strData.length-1; 0 <= i; i--) {
			for (int r = strData[i].length(); 0 < r ; r--) {
				temp .append(strData[i].charAt(r-1));
			}
			newVector.add(temp.toString());
			temp.setLength(0);
		}
		return newVector; 
	}
	
	public static void main(String[] args) {
		Prob1 st = new Prob1();
		String[] strData = {"Java Programming","JDBC","Oracle10g","JSP/Servlet"};
		Vector<String> v = st.dataChange(strData);

		for (int i =0;i <v.size();i++) {
			System.out.println(v.elementAt(i));
		}
		
	}

}
