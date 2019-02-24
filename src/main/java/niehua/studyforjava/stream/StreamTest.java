package niehua.studyforjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by niehua.yang on 2019/2/19
 */
public class StreamTest {
    public static void main(String[] args) {

        //map 转换大写，ssList为单词集合List<String>类型
        String[] ss = {"ab", "cd", "eF"};
        List<String> ssList = Arrays.asList(ss);
        List<String> output = ssList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(output);

        //filter 留下偶数，经过条件“被 2 整除”的 filter，剩下的数字为 {2, 4, 6}。
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Integer[] evens = Stream.of(nums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evens));
    }
}
