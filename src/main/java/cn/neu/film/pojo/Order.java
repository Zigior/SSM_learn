package cn.neu.film.pojo;

public class Order {
    private int oId;
    private int ouId;
    private int omId;
    private double oGrade;
    private double oCost;
    private String oDescribe;
    private int oIfDelete;
    private String oTime;
    private User user;
    private Movie movie;

    public Order() {
    }

    public Order(int oId, int ouId, int omId, double oGrade, double oCost, String oDescribe, int oIfDelete, String oTime, User user, Movie movie) {
        this.oId = oId;
        this.ouId = ouId;
        this.omId = omId;
        this.oGrade = oGrade;
        this.oCost = oCost;
        this.oDescribe = oDescribe;
        this.oIfDelete = oIfDelete;
        this.oTime = oTime;
        this.user = user;
        this.movie = movie;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getOuId() {
        return ouId;
    }

    public void setOuId(int ouId) {
        this.ouId = ouId;
    }

    public int getOmId() {
        return omId;
    }

    public void setOmId(int omId) {
        this.omId = omId;
    }

    public double getoGrade() {
        return oGrade;
    }

    public void setoGrade(double oGrade) {
        this.oGrade = oGrade;
    }

    public double getoCost() {
        return oCost;
    }

    public void setoCost(double oCost) {
        this.oCost = oCost;
    }

    public String getoDescribe() {
        return oDescribe;
    }

    public void setoDescribe(String oDescribe) {
        this.oDescribe = oDescribe;
    }

    public int getoIfDelete() {
        return oIfDelete;
    }

    public void setoIfDelete(int oIfDelete) {
        this.oIfDelete = oIfDelete;
    }

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", ouId=" + ouId +
                ", omId=" + omId +
                ", oGrade=" + oGrade +
                ", oCost=" + oCost +
                ", oDescribe='" + oDescribe + '\'' +
                ", oIfDelete=" + oIfDelete +
                ", oTime='" + oTime + '\'' +
                ", user=" + user +
                ", movie=" + movie +
                '}';
    }
}
