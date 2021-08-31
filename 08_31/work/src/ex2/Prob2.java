package ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class Prob2 {
	//Field
	
	//Constructor
	public Prob2() {}
	
	//Method
	public Vector getScore(String fileName) {
		Vector<ScoreVO> scoreList = new Vector<ScoreVO>();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			while ( (line = br.readLine()) != null ) {
				int sum =0; // 초기화
				String[] arr = line.split("/");
				
				for(int i = 1 ; i < arr.length; i++) {
					sum += Integer.parseInt(arr[i]);
				}// end of for
				scoreList.add(new ScoreVO(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),sum));
			}// end of while
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 잘못 입력");
			e.getStackTrace();
		}catch (IOException e) {
			System.out.println("파일을 잘못 입력");
			e.getStackTrace();
		}
		return scoreList;
	}
	// main method
	public static void main(String[] args) {
		Prob2 p2 = new Prob2();
		Vector scores = p2.getScore("src/data.txt");
			for (int i = 0; i < scores.size(); i++) {
			ScoreVO score = (ScoreVO)scores.get(i);
			System.out.println(score.getName()+ " : "+ score.getKor()+" " + score.getEng() + " " + score.getMath() + " " + score.getSum());
		}
	}// end of main
	

}// end of Prob2


