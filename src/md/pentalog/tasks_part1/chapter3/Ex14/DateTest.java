package md.pentalog.tasks_part1.chapter3.Ex14;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(2, 29, 1999);
        Date date2 = new Date(5, 29, 2015);
        Date date3 = new Date(1, 29, 2000);

        date1.displayDate(date1.getMonth(), date1.getDay(), date1.getYear());
        date2.displayDate(date2.getMonth(), date2.getDay(), date2.getYear());
        date3.displayDate(date3.getMonth(), date3.getDay(), date3.getYear());
    }
}
