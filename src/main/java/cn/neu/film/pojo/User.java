package cn.neu.film.pojo;

public class User {
    private int uId;
    private String uName;
    private String uPwd;
    private String uMail;
    private String uIcon;
    private int uExp;
    private String uCreateTime;
    private String uLastLoginTime;
    private double uAccount;
    private int uState;
    private int uSignDays;
    private int uIfDelete;
    private UserState userState;

    public User() {
    }

    public User(int uId, String uName, String uPwd, String uMail, String uIcon, int uExp, String uCreateTime, String uLastLoginTime, double uAccount, int uState, int uSignDays, int uIfDelete, UserState userState) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uMail = uMail;
        this.uIcon = uIcon;
        this.uExp = uExp;
        this.uCreateTime = uCreateTime;
        this.uLastLoginTime = uLastLoginTime;
        this.uAccount = uAccount;
        this.uState = uState;
        this.uSignDays = uSignDays;
        this.uIfDelete = uIfDelete;
        this.userState = userState;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    public String getuIcon() {
        return uIcon;
    }

    public void setuIcon(String uIcon) {
        this.uIcon = uIcon;
    }

    public int getuExp() {
        return uExp;
    }

    public void setuExp(int uExp) {
        this.uExp = uExp;
    }

    public String getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(String uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuLastLoginTime() {
        return uLastLoginTime;
    }

    public void setuLastLoginTime(String uLastLoginTime) {
        this.uLastLoginTime = uLastLoginTime;
    }

    public double getuAccount() {
        return uAccount;
    }

    public void setuAccount(double uAccount) {
        this.uAccount = uAccount;
    }

    public int getuState() {
        return uState;
    }

    public void setuState(int uState) {
        this.uState = uState;
    }

    public int getuSignDays() {
        return uSignDays;
    }

    public void setuSignDays(int uSignDays) {
        this.uSignDays = uSignDays;
    }

    public int getuIfDelete() {
        return uIfDelete;
    }

    public void setuIfDelete(int uIfDelete) {
        this.uIfDelete = uIfDelete;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uMail='" + uMail + '\'' +
                ", uIcon='" + uIcon + '\'' +
                ", uExp=" + uExp +
                ", uCreateTime='" + uCreateTime + '\'' +
                ", uLastLoginTime='" + uLastLoginTime + '\'' +
                ", uAccount=" + uAccount +
                ", uState=" + uState +
                ", uSignDays=" + uSignDays +
                ", uIfDelete=" + uIfDelete +
                ", userState=" + userState +
                '}';
    }
}
