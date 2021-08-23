//SuperThisText

class JuniorHighSchool{
    //Field
    String name = "대한민국중학교";
	int age= 1111;

    //Constructor
    public  JuniorHighSchool() {
    }

    //Meyhod
    public void schoolName() {
        System.out.println("중학교 이름 = "+name);
    }
}//end of class

class HighSchool extends JuniorHighSchool{
    //Field
    String name = "대한민국고등학교";

    //Constructor
    public  HighSchool() {
    }
    public  HighSchool(String str) {
        name=str;
		int age= 100;
		System.out.println(age);
		System.out.println(this.age);
		
    }
    // 위 아래 약간 다름 확인점.
    // public  HighSchool(String name) {
    //     this.name = name;
    // }

    //Meyhod
    public void schoolName() {
        System.out.println("중학교 이름 = "+super.name);
        System.out.println("고등학교 이름 = "+this.name);
        System.out.println("중학교 이름 = "+name);
    }
}//end of class

public class SuperThisText{
    //main
    public static void main(String[] args) {
        HighSchool hs01 = new HighSchool ();

        hs01.schoolName();

        System.out.println("=============");

        HighSchool hs02 = new HighSchool ("서울고등학교");
        hs02.schoolName();

    }
}
