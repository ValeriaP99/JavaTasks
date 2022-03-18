package md.pentalog.tasks_part1.chapter8.Ex8;

public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year)
    {
        if (year <= 1950 || year > 2022)
            throw new IllegalArgumentException(
                    "year (" + year + ") must be between 1950-2021");

        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Date object constructor for date %s%n", this);
    }

    public void nextDay() {
        if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
            if (day==31) {
                day=1;
                if (month==12) {
                    month=1;
                    year+=1;
                }
                else
                    month+=1;
            }
            else
                day+=1;
        }
        else if ((month==4)||(month==6)||(month==9)||(month==11)) {
            if (day==30) {
                day=1;
                month+=1;
            }
            else
                day+=1;
        }
        else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (day==29) {
                    day=1;
                    month+=1;
                }
                else
                    day+=1;
            }
            else {
                if (day==28) {
                    day=1;
                    month+=1;
                }
                else
                    day+=1;
            }
        }
    }

    public void verify() {
        if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))
            System.out.println("February has 29 days");
        else
            System.out.println("February has 28 days");
    }


    // return a String of the form month/day/year
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
