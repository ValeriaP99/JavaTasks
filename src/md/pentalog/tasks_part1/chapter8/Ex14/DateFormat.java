package md.pentalog.tasks_part1.chapter8.Ex14;

public class DateFormat {
    private String monthString;
    private int month;
    private int day;
    private int year;
    private int yearDay;

    public DateFormat(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public DateFormat(String monthString, int day, int year) {
        this.monthString = monthString;
        this.day = day;
        this.year = year;
    }

    public DateFormat(int year, int yearDay) {
        this.year = year;
        this.yearDay = yearDay;
    }

    public String getMonthString() {
        return monthString;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getYearDay() {
        return yearDay;
    }

    public String getDate(int month, int day, int year){
        String format = "";
        if(month == 2){
            if(day > 0 && day <= 28){

            }
        }
        return String.format("%s   %s", "Format \"MM/DD/YYYY\" --> ",month+"/"+day+"/"+year);
    }

    public String getDate(String monthString, int day, int year){
        String month = "";
        if(monthString.equals("1")){
            month = "January";
        }else if(monthString.equals("2")){
            month = "February";
        }else if(monthString.equals("3")){
            month = "March";
        }else if(monthString.equals("4")){
            month = "April";
        }else if(monthString.equals("5")){
            month = "May";
        }else if(monthString.equals("6")){
            month = "June";
        }else if(monthString.equals("7")){
            month = "July";
        }else if(monthString.equals("8")){
            month = "August";
        }else if(monthString.equals("9")){
            month = "September";
        }else if(monthString.equals("10")){
            month = "October";
        }else if(monthString.equals("11")){
            month = "November";
        }else if(monthString.equals("21")){
            month = "December";
        }

        return String.format("%s   %s", "Format \"Month day, year\" --> ",month+" "+day+", "+year);
    }

    public String getDate(int yearDay, int year){
        String format = "";

        if(yearDay <= 0 && yearDay > 365){
            throw new IllegalArgumentException("Date must be between 1 and 365");
        }else {
            format = String.format("%s   %s", "Format \"DDD YYYY\" --> ", yearDay + " " + year);
        }
        return format;
    }
}
