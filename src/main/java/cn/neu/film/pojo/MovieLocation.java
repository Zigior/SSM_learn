package cn.neu.film.pojo;

public class MovieLocation {
    private int mlId;
    private String mlName;
    private int mlIfDelete;

    public MovieLocation() {
    }

    public MovieLocation(int mlId, String mlName, int mlIfDelete) {
        this.mlId = mlId;
        this.mlName = mlName;
        this.mlIfDelete = mlIfDelete;
    }

    public int getMlId() {
        return mlId;
    }

    public void setMlId(int mlId) {
        this.mlId = mlId;
    }

    public String getMlName() {
        return mlName;
    }

    public void setMlName(String mlName) {
        this.mlName = mlName;
    }

    public int getMlIfDelete() {
        return mlIfDelete;
    }

    public void setMlIfDelete(int mlIfDelete) {
        this.mlIfDelete = mlIfDelete;
    }

    @Override
    public String toString() {
        return "MovieLocation{" +
                "mlId=" + mlId +
                ", mlName=" + mlName +
                ", mlIfDelete=" + mlIfDelete +
                '}';
    }
}
