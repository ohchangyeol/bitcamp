class TopSecret02{
    // field 
    private int secretNo = 7777;

    //Constructor
    public TopSecret02() {
    }
    //Method
    //getter method
    public int getSecretNo (int pwd) {
        if (pwd == 0){
            return secretNo;
        }else{
            return 0;
        }
    }
}// end class

public class ModifierTest02{
    public static void main(String[] args) {
        TopSecret02 topSecret = new TopSecret02();
        //System.out.println(topSecret.secretNo);

        //secretNo를 변경하면?
        //topSecret.secretNo = 1234;
        //System.out.println(topSecret.secretNo); // 불가

        System.out.println(topSecret.getSecretNo(0));


    }
}