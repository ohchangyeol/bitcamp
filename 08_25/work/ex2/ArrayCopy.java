import java.util.Vector;

public class ArrayCopy{
	
	public Vector<String> moveToVector(String[] datas){
		Vector<String> temp = new Vector(datas.length, datas.length);

		for(String str : datas){
			System.out.println(str);
			temp.add(0, str);
		}
		return temp;//datas;
	}

	public static void main(String[] agrs){
		
		ArrayCopy ac= new ArrayCopy();
		String[] datas = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
		
		
	}//end of main
}//end of class 