import phone.CellPhone;

public class CellPhoneMain {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone("SCH-600");

        myPhone.charge(20); //20분 충전
        myPhone.printBattery(); // 배터리 확인
        
        myPhone.call(300); // 300분 통화
        myPhone.printBattery(); // 배터리 확인
        
        myPhone.charge(50); // 50분 충전
        myPhone.printBattery(); // 배터리 확인

        myPhone.call(40);// 40분 통화
        myPhone.printBattery(); // 배터리 확인
        
        try {
            myPhone.call(-20);// 40분 통화
            
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());     
        }

        CellPhone youPhone = new CellPhone("SCH-600");

        if (myPhone.equals(youPhone)){
            System.out.println("동일 모델입니다.");
        }else{
            System.out.println("다른 모델입니다.");
        }
    }
}
