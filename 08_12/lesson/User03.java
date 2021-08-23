public class User03 {
    //Field 
    String name;
    int javaLevel;
	int[] arr = new int [9];


    //dfefault Constructor
    public User03() {
        System.out.println("나는 생성자");
        name = "홍길동";
        javaLevel = 0 ;
    }
    // 인스턴스를 생성시 name 의 상태값을 설정하는(초기화) 생성자.
    public User03(String str) {
        System.out.println("나는 String을 인자로 받아 name을 초기화 하는 생성자");
        name = str;
    }
    // 인스턴스를 생성시 javaLevel 의 상태값을 설정하는(초기화) 생성자.
    public User03(int i) {
        System.out.println("나는 int을 인자로 받아 javaLevel를 초기화 하는 생성자");
        javaLevel = i;
    }
    // 인스턴스를 생성시 name,javaLevel 의 상태값을 설정하는(초기화) 생성자.
    public User03(String str, int i) {
        System.out.println("나는 String,int을 인자로 받아 name,javaLevel를 초기화 하는 생성자");
        name = str;
        javaLevel = i;
    }
    // Method
    public String getName() {
        return name;
    }
    public int getJavaLevel() {
        return javaLevel;
    }
	public int[] getArr() {
        return arr;
    }

    //main
    public static void main(String[] args) {
        // 각각의 오버로딩된 생성자를 호출시 상태값을 출력.
        System.out.println("=================");
        User03 user01 = new User03();
        System.out.println("name = " + user01.getName());
        System.out.println("javaLevel = " + user01.getJavaLevel());

        System.out.println("=================");
        User03 user02 = new User03("홍길순");
        // ==> 상태값을 설정하지 않은(초기화를 하지않은)javaLevel의 출력값.
        System.out.println("name = " + user02.getName());
        System.out.println("javaLevel = " + user02.getJavaLevel());

        System.out.println("=================");
        User03 user03 = new User03(100);
        // ==> 상태값을 설정하지 않은(초기화를 하지않은)name 출력값.
        System.out.println("name = " + user03.getName());
        System.out.println("javaLevel = " + user03.getJavaLevel());

        System.out.println("=================");
        User03 user04 = new User03("순신순신이순신",100);
        System.out.println("name = " + user04.getName());
        System.out.println("javaLevel = " + user04.getJavaLevel());
        System.out.println("javaLevel = " + user04.getArr());
        
        
    }
    
}