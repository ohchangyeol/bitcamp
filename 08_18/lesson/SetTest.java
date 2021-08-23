import java.util.HashSet;
import java.util.Set;

/**
 * SetTest
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> hs  = new HashSet<String>();

        String str = "A";
        boolean isAddOk = hs.add(str);
        System.out.println("저장유무 : "+isAddOk);
        
        isAddOk = hs.add("b");
        System.out.println("저장유무 : "+isAddOk);

        isAddOk = hs.add("B");
        System.out.println("저장유무 : "+isAddOk);

        isAddOk = hs.add("B");
        System.out.println("저장유무 : "+isAddOk);

        System.out.println("저장된 data 개수 : "+ hs.size());
        if (hs.contains("b")) {
            System.out.println("저장된 data b를 삭제함ㅋㅋㅋ");
            hs.remove("b");
        }
        System.out.println("저장된 data 개수 : "+ hs.size());
    }
}// end of class