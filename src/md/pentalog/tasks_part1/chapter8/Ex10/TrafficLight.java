package md.pentalog.tasks_part1.chapter8.Ex10;

public enum TrafficLight {
    RED("2.4"),
    GREEN("3,5"),
    YELLOW("1,5");

    private final String seconds;

    public String getSeconds() {
        return seconds;
    }

    TrafficLight(String seconds) {
        this.seconds = seconds;
    }
}
