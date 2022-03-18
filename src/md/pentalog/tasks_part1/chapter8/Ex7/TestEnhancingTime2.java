package md.pentalog.tasks_part1.chapter8.Ex7;

public class TestEnhancingTime2 {
    public static void main(String[] args)
    {
        EnhancingTime2 t = new EnhancingTime2(0, 0, 0);

        t = new EnhancingTime2(8, 15, 47);
        displayTime("Time before change:", t);
        t.trick(0,0,1);
        displayTime("After adding 1 second:", t);
        System.out.println();

        t = new EnhancingTime2(8, 15, 47);
        displayTime("Time before change:", t);
        t.trick(0,1,1);
        displayTime("After adding 1 second and 1 minute:", t);
        System.out.println();

        t = new EnhancingTime2(8, 15, 47);
        displayTime("Time before change:", t);
        t.trick(1,1,1);
        displayTime("After adding 1 second, 1 minute and 1 hour:", t);
        System.out.println();

        t = new EnhancingTime2(23, 59, 59);
        displayTime("Time before change:", t);
        t.trick(0,0,1);
        displayTime("After adding 1 second:", t);
        System.out.println();

        t = new EnhancingTime2(23, 59, 0);
        displayTime("Time before change:", t);
        t.trick(0,1,0);
        displayTime("After adding 1 minute:", t);
        System.out.println();

        t = new EnhancingTime2(23, 0, 0);
        displayTime("Time before change:", t);
        t.trick(1,0,0);
        displayTime("After adding 1 hour:", t);
        System.out.println();

        t = new EnhancingTime2(23, 58, 59);
        displayTime("Time before change:", t);
        t.trick(0,1,1);
        displayTime("After adding 1 second and 1 minute:", t);
        System.out.println();

        t = new EnhancingTime2(22, 59, 59);
        displayTime("Time before change:", t);
        t.trick(1,0,1);
        displayTime("After adding 1 second and 1 hour:", t);
        System.out.println();

        t = new EnhancingTime2(22, 58, 59);
        displayTime("Time before change:", t);
        t.trick(1,1,1);
        displayTime("After adding 1 second, 1 minute and 1 hour:", t);
        System.out.println();
    }


    // displays a EnhancingTime2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, EnhancingTime2 t)
    {
        System.out.printf("%n%s%n   %s%n   %s",
                header, t.toUniversalString(), t.toString());
    }
}
