public class User01 {
    //Field 
    String name = "홍길동";
    int javaLevel = 0;

    //dfefault Constructor
    public User01() {
        System.out.println("Constructor Method");
    }

    // Method
    public String getName() {
        return name;
    }
    public int getJavaLevel() {
        return javaLevel;
    }

    //main
    public static void main(String[] args) {
        
        System.out.println("=================");
        User01 user = new User01();
        System.out.println("=================");
		
        //출력 결과 확인 후 아래 주석 풀기
        /*
        System.out.println("=================");
        User01 uesr;
        System.out.println("=================");
        uesr = new User01();
        System.out.println("=================");
        new User01();
        System.out.println("=================");
        */
        System.out.println("name" + uesr.getName());
        System.out.println("javaLevel" + uesr.getJavaLevel());
    }
    
}