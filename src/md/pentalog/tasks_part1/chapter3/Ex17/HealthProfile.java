package md.pentalog.tasks_part1.chapter3.Ex17;

import java.time.LocalDate;

public class HealthProfile {
    public enum GENDER{MALE, FEMALE};

    private String firstName;
    private String lastName;
    private GENDER gender;
    private int month;
    private int day;
    private int year;
    private double weight;
    private double height;

    public HealthProfile(String firstName, String lastName, GENDER gender, int month, int day, int year, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int calculateAge(int month, int day, int year){
        LocalDate now = LocalDate.now();
        year = now.getYear() - year;
        month = now.getMonthValue() - month;
        day = now.getDayOfMonth() - day;

        if(month < 0){
            year--;
        }else if(month == 0){
            if(day < 0){
                year--;
            }
        }
        return year;
    }

    public int calculateMaximumHeartRate(){
        int age = calculateAge(getMonth(), getDay(), getYear());
        return 220 - age;
    }

    public String calculateTargetHeartRate(){
        return String.format("%.0f - %.0f", calculateMaximumHeartRate()*0.5, calculateMaximumHeartRate()*0.85);
    }

    public double getBMI(double weight, double height){
        return weight*703/(height*height);
    }
}
