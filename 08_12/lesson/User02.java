public class User02 {
    //Field 
    String name;
    int javaLevel;

    //Constructor = 생성자
	public User02() {
    //public User022() { // 이름을 다르게 했을때의 결과. error => invalid method declaration; return type required 잘못된 메서드 선언,반환이 필요함
						 // void 가 없을때 return으로 반환을 해야한다.하지만 class의 이름과 method의 이름이 같다면 인스턴스 생성시 호출이 됨으로 field variable 의 초기화 작업이 가능하다.
        System.out.println("Constructor Method");
        name = "홍길동";
        javaLevel = 0 ;
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
        User02 user = new User02();
        System.out.println("=================");

        System.out.println("name" + user.getName());
        System.out.println("javaLevel" + user.getJavaLevel());
    }
    
}