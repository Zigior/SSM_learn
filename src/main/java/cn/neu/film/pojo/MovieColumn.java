package cn.neu.film.pojo;

public class MovieColumn {
    private int mcId;
    private String mcName;
    private int mcIfDelete;

    public MovieColumn() {
    }

    public MovieColumn(int mcId, String mcName, int mcIfDelete) {
        this.mcId = mcId;
        this.mcName = mcName;
        this.mcIfDelete = mcIfDelete;
    }

    public int getMcId() {
        return mcId;
    }

    public void setMcId(int mcId) {
        this.mcId = mcId;
    }

    public String getMcName() {
        return mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public int getMcIfDelete() {
        return mcIfDelete;
    }

    public void setMcIfDelete(int mcIfDelete) {
        this.mcIfDelete = mcIfDelete;
    }

    @Override
    public String toString() {
        return "MovieColumn{" +
                "mcId=" + mcId +
                ", mcName='" + mcName + '\'' +
                ", mcIfDelete=" + mcIfDelete +
                '}';
    }
}
