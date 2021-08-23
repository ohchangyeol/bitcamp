final class TopSecret03{
    // field 
    //final modifier - ��ӺҰ�
    private final int secretNo = 7777;

    //Constructor
    private TopSecret03() {
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
    public static TopSecret03 getInstance(){
        TopSecret03 topSecret = new TopSecret03();
        return topSecret;
    }
}// end class

public class ModifierTest03{
    public static void main(String[] args) {
        // TopSecret topSecret = new TopSecret();

        TopSecret03 topSecret = TopSecret03.getInstance();
        System.out.println(topSecret.getSecretNo(0));
    }//end main
} //end class