package cn.neu.film.pojo;

public class MovieType {
    private int mtId;
    private String mtName;
    private int mtIfDelete;

    public MovieType() {
    }

    public MovieType(int mtId, String mtName, int mtIfDelete) {
        this.mtId = mtId;
        this.mtName = mtName;
        this.mtIfDelete = mtIfDelete;
    }

    public int getMtId() {
        return mtId;
    }

    public void setMtId(int mtId) {
        this.mtId = mtId;
    }

    public String getMtName() {
        return mtName;
    }

    public void setMtName(String mtName) {
        this.mtName = mtName;
    }

    public int getMtIfDelete() {
        return mtIfDelete;
    }

    public void setMtIfDelete(int mtIfDelete) {
        this.mtIfDelete = mtIfDelete;
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "mtId=" + mtId +
                ", mtName='" + mtName + '\'' +
                ", mtIfDelete=" + mtIfDelete +
                '}';
    }
}
