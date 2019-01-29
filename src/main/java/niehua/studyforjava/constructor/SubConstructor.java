package niehua.studyforjava.constructor;

/**
 * Created by niehua.yang on 2019/1/23
 */
public class SubConstructor  extends BaseConstructor{

    private String subName = "aaa";

    /*public String getName(){
        return name;
    }*/

    public String getName(){
        return "";
    }
    public static void main(String[] args) {
        BaseConstructor ins = new SubConstructor();
        System.out.println(((SubConstructor) ins).subName);
        //System.out.println(ins.getName());
    }
}
