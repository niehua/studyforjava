package niehua.studyforjava.object_oriented;

/**
 * Created by niehua.yang on 2019/1/24
 */
public abstract class UserAbstract implements UserInterface {

    private String privateWeight;

    protected String protectedWeight;

    public String publicWeight;

    public String getProtectedWeight(){
        return protectedWeight;
    }

    public String getPublicWeight(){
        return publicWeight;
    }

}
