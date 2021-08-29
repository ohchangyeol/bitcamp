package ex4;

import java.io.*;
import java.util.Vector;

public class FileController {
	//field
	String line ;
	Vector<String> reverseArray;
	
	//constructor
	public FileController() {
		reverseArray = new Vector<String>();
	}
	
	//method
	private void reverseLine(String oldf, String newf) throws Exception {
		// local
		BufferedReader bReader = new BufferedReader(new FileReader(oldf));
		BufferedWriter bWriter =new BufferedWriter(new FileWriter(newf));
		
		addReverse(bReader);
		for(int i = reverseArray.size()-1 ;0 <= i ; i--) {
			//System.out.println(reverseArray.get(i));
			bWriter.write(reverseArray.get(i));
			bWriter.newLine();
		}
		//System.out.println(reverseArray);
		
		bReader.close();
		bWriter.close();
	}

	private void addReverse(BufferedReader bReader) throws IOException {
		while ((line =bReader.readLine()) != null) {
			reverseArray.add(line);
		}
	}
	public static void main(String[] args) throws Exception  {

		FileController c = new FileController();
		String oldf ="src/ex4/files/oldf.txt";
		String newf ="src/ex4/files/newf.txt";
		c.reverseLine(oldf,newf);
	}

	

}
