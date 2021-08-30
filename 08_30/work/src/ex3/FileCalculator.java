package ex3;

import java.io.*;


public class FileCalculator {
	
	public void addCalculateResult(String inputFileName)throws Exception {
		BufferedReader br =new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw =new BufferedWriter(new FileWriter(inputFileName, true));
		int sum = 1 ;
		int add = 0 ;
		String ch = "";
		while (true) {
			if((ch = br.readLine()) == null) {
				bw.write("\n"+add+"\n"+sum);
				break;
			}else {
				add += Integer.parseInt(ch);
				sum *= Integer.parseInt(ch);
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws Exception{
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("D:\\test.dat");
	}

}
