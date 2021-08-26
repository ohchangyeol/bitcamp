package phone;
/* 
beans
*/
public class CellPhone {
  //Field
  String model;
  double battery;
  
  //constructor
  public CellPhone(String model){
    this.model =model; 
  }

  //method
  public void printBattery() throws IllegalArgumentException{
      System.out.println("남은 배터리 양 : "+ battery);
  }

  public void call(int time) {
    if(time < 0){// 예외
        throw new IllegalArgumentException("통화시간입력오류");
    }
    System.out.println("통화 시간 :" + time + " 분");
    battery -= (time * 0.5);
    if (battery < 0 ){
        battery = 0.0;
    }
  }
  public void charge(int time) {
    if(time < 0){// 예외
        throw new IllegalArgumentException("충전시간입력오류");
    }
    System.out.println("충전 시간 : " + time);
    battery += time * 3;
    if(battery > 100 ){
    battery = 100.0;
    }
  }
  public boolean equals(Object otherObject) {
      if(otherObject instanceof CellPhone && this.model==((CellPhone)otherObject).model ){
        return true;
      }
      return false;
  }
}
