package niehua.studyforjava.decimal;

import java.text.DecimalFormat;

/**
 * Created by niehua.yang on 2019/1/23
 */
public class DecimalFomatTest {

    public static void main(String[] args) {
        float price = 1.264667f; //四舍五入
        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p = decimalFormat.format(price);//format 返回的是字符串

        System.out.println(p);
    }
}
