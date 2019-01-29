package niehua.studyforjava.object_oriented;

/**
 * Created by niehua.yang on 2019/1/24
 */
public class UserIml extends UserAbstract {

    public String getPublicWeight(){
        return "ImlPublicWeight";
    }

    @Override
    public String getProtectedWeight(){
        return protectedWeight;
    }

    public static void main(String[] args) {
        UserAbstract ins = new UserIml();
        System.out.println(ins.publicWeight);//null 说明get方法不会赋上值
        System.out.println(ins.getProtectedWeight());//说明可以给普通方法加@Override
    }
}
