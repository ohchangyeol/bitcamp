public class MethodSyntexTestApp {

	/*
		bean인 MethodSyntax.class 를 사용하는 application class.
	*/


    //field

    // main
    public static void main(String[] args) {
        MethodSyntax methodSyntax = new MethodSyntax();// instance.
        System.out.println("\n=========================");
        methodSyntax.browerOn();

        System.out.println("\n=========================");
        boolean resuit = methodSyntax.documentWork();
        System.out.println("doc 작업 유무 = " + resuit);

        System.out.println("\n=========================");
        int value = methodSyntax.sum(1, 1);
        System.out.println("계산 결과 값 = " + value);
		// 두 라인을 아래와 같이 표현, 주석 풀고 결과 확인. 
		//System.out.println("계산 결과 값 = " + methodSyntax.sum(1, 1));
		// 결과는 같으나 재사용성이 있으면 변수에 넣고 아니면 바로 출력 하는게 좋을듯?

        System.out.println("\n=========================");
        String name = methodSyntax.getName();
        System.out.println("Field 정보 name = " + name);
        // System.out.println("Field 정보 name = " + methodSyntax.getName());
        
        System.out.println("\n=========================");
        String add = methodSyntax.getAdd();
        System.out.println("Field 정보 add = " + add);
        // System.out.println("Field 정보 add = " + methodSyntax.getAdd());

        System.out.println("\n=========================");
        String [] info = methodSyntax.getAlllnformation();
        System.out.println("field 정보 모두 출력 ");
        for (int i = 0; i < info.length; i++) {
		// for(int i =0; i< 2 ; i++){ // info.length와의 차이점 -> 인자값이 더 추가될경우 길이에 맞춰 수동으로 수정을 해야하지만 .length를 사용함으로 info의 길이를 자동으로 알아낸다.
            System.out.println((i+1)+"번째 정보 = "+ info[i]);
        }
        

    }
}