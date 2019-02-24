package niehua.studyforjava.split;

import java.util.Arrays;

/**
 * Created by niehua.yang on 2019/2/19
 */
public class StringSplit {

    public static void main(String[] args) {

        String s = "boo:and:foo";
        String[] ss = s.split(":", 0);
        System.out.println(Arrays.toString(ss));
    }

}
