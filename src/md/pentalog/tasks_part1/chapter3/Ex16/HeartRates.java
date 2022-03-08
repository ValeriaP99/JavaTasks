package md.pentalog.tasks_part1.chapter3.Ex16;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    int month;
    int day;
    int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
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

}
