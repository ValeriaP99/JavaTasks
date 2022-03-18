package md.pentalog.tasks_part1.chapter8.Ex10;

import md.pentalog.tasks_part1.chapter7.Ex21;

public class TestTrafficLight {
    public static void main(String[] args) {
        System.out.println("----[ Traffic Light ]-----");

        System.out.printf("[%-10s] - %-5s%n", "Color", "Duration");
        Ex21.drawBorderLine(26,'-');
        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.printf("[%-10s] - %-5s%n", trafficLight, trafficLight.getSeconds());
        }
        Ex21.drawBorderLine(26,'-');
    }
}
