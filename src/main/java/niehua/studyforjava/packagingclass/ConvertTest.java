package niehua.studyforjava.packagingclass;

/**
 * Created by niehua.yang on 2019/2/20
 */
public class ConvertTest {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = 0;

        if(b == 0){
            System.out.println("b == 0");
        }else {
            System.out.println("b = 0");
        }

        if(a == 0){
            System.out.println("null == 0");
        }else {
            System.out.println("null = 0");
        }
    }
}
