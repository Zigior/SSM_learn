package cn.neu.film.pojo;

public class UserState {
    private int usId;
    private String usName;
    private int usIfDelete;

    public UserState() {
    }

    public UserState(int usId, String usName, int usIfDelete) {
        this.usId = usId;
        this.usName = usName;
        this.usIfDelete = usIfDelete;
    }

    public int getUsId() {
        return usId;
    }

    public void setUsId(int usId) {
        this.usId = usId;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public int getUsIfDelete() {
        return usIfDelete;
    }

    public void setUsIfDelete(int usIfDelete) {
        this.usIfDelete = usIfDelete;
    }

    @Override
    public String toString() {
        return "UserState{" +
                "usId=" + usId +
                ", usName='" + usName + '\'' +
                ", usIfDelete=" + usIfDelete +
                '}';
    }
}
