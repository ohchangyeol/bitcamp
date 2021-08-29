package ex3;
import java.util.*;

// 문자열 배열의 내용을 역순으로 출력하되 각 문자열또한 역순으로 출력한다.

public class Prob {
	//Field
	StringBuffer temp ; 
	List<String> newVector ;
	// Constructor
	public Prob() {
		temp =new StringBuffer();
		newVector =new Vector<String>();
	}
	
	//  method - api에 StringBuffer의 reverse 메소드 활용
	public List<String> dataChange (String[] strData){
		for(int i = strData.length-1; 0 <= i; i--) {
			newVector.add(temp.append(strData[i]).reverse().toString());
			temp.setLength(0);
		}
		return newVector; 
	}
		
	public static void main(String[] args) {
		Prob st = new Prob();
		String[] strData = {"Java Programming","JDBC","Oracle10g","JSP/Servlet"};
		List<String> v = st.dataChange(strData);
		
		for (int i =0;i <v.size();i++) {
			System.out.println(v.get(i));
		}
		
	}

}
