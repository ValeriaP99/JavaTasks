package md.pentalog.tasks_part1.chapter11.Ex16;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ExceptionB("ExceptionB!!!");
        }catch(ExceptionA exA){
            System.err.println("------[ ExceptionA catch exception of type ExceptionB ]-------");
        }

        try{
            throw new ExceptionC("ExceptionC!!!");
        }catch(ExceptionA exA){
            System.err.println("------[ ExceptionA catch exception of type ExceptionC ]-------");
        }
    }
}
