package pr2.demo.com.mycontacts;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class User {
    public final static String NAME = "name";
    public final static String MOBILE="mobile";
    public final static String DANWEI = "danwei";
    public static final String QQ="qq";
    public static final String ADDRESS ="address";

    private String name;
    private String mobile;
    private String danwei;
    private String qq;
    private String address;
    private int id_DB=-1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId_DB() {
        return id_DB;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }

;
}
