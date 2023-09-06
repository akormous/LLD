public class Player {
    private String name;
    private Integer position;

    public Integer getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Player(String name, Integer position) {
        this.name = name;
        this.position = position;
    }
}
