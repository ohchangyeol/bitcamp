class Super{
    ///method
    public void a (){
        System.out.println("Super = a()");
    }
}

class Sub extends Super{
    ///method
    public void a (){
        System.out.println("overriding 된 Sub = a()");
    }
    public void b (){
        System.out.println("Sub = a()");
    }
}
public class CastingComplete{
    //main
    public static void main(String[] args) {
        System.out.println("\n 여기는 Super s1 = new Super() 부분");
        Super s1 = new Super();
        s1.a();

        System.out.println("\n 여기는 Sub s2 = new Sub() 부분");
        Sub s2 = new Sub() ;
        s2.a();
        s2.b();
        
        System.out.println("\n 여기는 Super s3 = new Sub() 부분");
        Super s3 = new Sub() ;
        s3.a();
        //s3.b();
        // s3.a(); 를 사용하려면 ==> casting 연산자 사용 

        System.out.println("\n s3는 b()에 접근 불가하다.");
        System.out.println("\n 여기는 Sub sub = (Sub)s3 명시적 형변환");
        Sub sub =(Sub)s3;
        sub.b();

        //Sub s4 = new Super();

    }
}