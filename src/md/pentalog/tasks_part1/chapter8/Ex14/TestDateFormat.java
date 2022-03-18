package md.pentalog.tasks_part1.chapter8.Ex14;

public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat dateFormat1 = new DateFormat(2, 6, 2022);
        DateFormat dateFormat2 = new DateFormat("5", 6, 2022);
        DateFormat dateFormat3 = new DateFormat(2004, 123);

        System.out.println(dateFormat1.getDate(dateFormat1.getMonth(), dateFormat1.getDay(), dateFormat1.getYear()));
        System.out.println(dateFormat2.getDate(dateFormat2.getMonthString(), dateFormat2.getDay(), dateFormat2.getYear()));
        System.out.println(dateFormat3.getDate(dateFormat3.getYearDay(), dateFormat3.getYear()));
    }
}
