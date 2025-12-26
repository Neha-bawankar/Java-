package enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Ready for going");

    private   final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
