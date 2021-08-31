package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Grade {
	// Field
	BufferedReader br;
	String textLine;
	
	int sum;
	int count;
	// constructor
	public Grade() {
		
	}
	// method
	public void printGrade(String fileName) throws FileNotFoundException,IOException{
		br = new BufferedReader(new FileReader(fileName));
		while ((textLine = br.readLine()) != null) {
			String[] datas = textLine.split(","); 
			System.out.println(datas[0] + "의 점수는 "+datas[1]+"점 입니다."); 
			sum += Integer.parseInt(datas[1]);
			count++;
		}// end of while 
		br.close();
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		System.out.println("모두의 평균은 "+sum/count+"점 입니다.");
	}
	// main 
	public static void main(String[] args) {
		Grade grade = new Grade();
		String fileName = "score.txt";
		try{
			grade.printGrade(fileName);
		}catch (FileNotFoundException e) {
			System.out.println("파일 경로나 파일 명이 틀리셨네요ㅎ..");
			e.getStackTrace();
		}catch (IOException e) {
			e.getStackTrace();
		}catch (Exception e) {
			e.getStackTrace();
		}
		
	}// end of main

}// end of class
