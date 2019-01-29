package niehua.studyforjava.paradigm;

/**
 * Created by niehua.yang on 2019/1/25
 */
public class ParadigmTest {

    public <T> T test1(){//只能返回null,且不能调用
        return  null;
    }

    public <T> T test2(Class<T> tClass) throws Exception{
        return  tClass.newInstance();
    }

    public <T> T test3(T t){
        return  t;
    }

    public <T extends Object> T test4(T t){
        return  t;
    }

    public static void main(String[] args) throws Exception{
        ParadigmTest ins = new ParadigmTest();
        System.out.println(ins.test2("1".getClass()));//说明可以给普通方法加@Override
        System.out.println(ins.test3(2));//说明可以传入基本数据

        System.out.println(ins.test4(3));//说明基本数据会自动装箱
    }
}
