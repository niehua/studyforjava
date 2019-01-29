package niehua.studyforjava;

import java.util.Arrays;
import java.util.List;

/**
 * @author: niehua.yang
 * @date: 2018/12/5
 */
public class Test {
    static void fun(){
        Thread t = new Thread(() -> {
            System.out.println("子线程开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        });
        t.start();

        System.out.println("子线程结束");
    }
    public static void main(String[] args) {
        System.out.println("主线程开始");
        fun();

        System.out.println("主线程结束");


        List<String> list = Arrays.asList("a", "b", "c", "d");

        /*boolean a = true;
        boolean b = false;

        System.out.println( b || a && a  );
        String c = null;
        System.out.println( null + "V2"  );
        System.out.println( c + "V2"  );

        Byte status = 2;
        if(1 == status){//NullPointerException-》调用了对象的equals()方法
            System.out.println( "OK"  );
        }

        Integer e = 1111;
        Integer f = 1111;
        List<String> l = new ArrayList<>();
        l.add("1");
        System.out.println(e == f);
        System.out.println(e == 1111);*/


       /* Comparator<String> cvvvv = (s1, s2) -> s1.compareToIgnoreCase(s2);
        Callable<String> hhh = () -> "done";
        String cccc="";
        try{
            cccc = hhh.call();
        }catch (Exception e){}
        System.out.println(cccc);*/
       /* String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

// 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println("===========");
// 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        System.out.println("===========");
// 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);*/
    }
}


