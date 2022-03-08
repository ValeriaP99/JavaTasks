package md.pentalog.tasks_part1.chapter3.Ex14;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2){
            if(year % 4 == 0){
                if(day > 0 && day <= 29){
                    this.day = day;
                }else{
                    System.out.println("Day must be between 1 and 29");
                }

            }else if(year % 4 != 0){
                if(day > 0 && day <= 28){
                    this.day = day;
                }else{
                    System.out.println("Day must be between 1 and 28");
                }
            }
        }else if(month != 2){
            if (day > 0 && day <= 31){
                this.day = day;
            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0){
            this.year = year;
        }
    }

    public void displayDate(int month, int day, int year){
        System.out.println(month+"/"+day+"/"+year);
    }
}
