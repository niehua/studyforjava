package niehua.studyforjava.object_oriented;

/**
 * Created by niehua.yang on 2019/1/24
 */
public class UserIml2 extends UserIml{

    //说明可以给普通方法加@Override,无论父类是实现类还是抽象类
    @Override
    public String getPublicWeight(){
        return "ImlPublicWeight";
    }
}
