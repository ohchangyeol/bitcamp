package ex2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Prob2 {
	//method
	public static int[] generateRandomNumber() {
		int[] randomInt = new int[10];

		for (int i = 0; i < 10 ; i ++) {
			randomInt[i] = new Random().nextInt(21);
		
			for(int j = 0; j < i ; j ++) {
				if(randomInt[i] == randomInt[j]) {
					i--;
				}
			}
		}
		return randomInt ;
	}
	public static void printStatistics(int [] array) throws IOException {
			BufferedWriter bw = new BufferedWriter(new FileWriter("store.txt", true));
			double sum = 0;
			int max = array[0];
			int min = array[0];
			for (int i = 0; i < array.length; i++) {
				if(max < array[i]) {
					max = array[i];
				}
				if(min > array[i]) {
					min = array[i];
				}
				sum += array[i];
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			bw.write("최대값 : "+max+"\n최소값 : "+min+"\n평균값 : "+(sum/array.length));
			bw.flush();
			bw.close();
			
	}
	
	//main method
	public static void main(String[] args) {
		try {
			Prob2.printStatistics(Prob2.generateRandomNumber());
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
