package md.pentalog.tasks_part1.chapter11.Ex17;

import java.io.IOException;

public class Exception1Test {
    public static void main(String[] args) {
        try{
            throw new ExceptionA1("ExceptionA1");
        }catch (Exception ex){
            System.err.println("------[ Exception catch exception of type ExceptionA1 ]-------");
        }

        try{
            throw new ExceptionB1("ExceptionB1");
        }catch (Exception ex){
            System.err.println("------[ Exception catch exception of type ExceptionB1 ]-------");
        }

        try{
            throw new NullPointerException("NullPointerException");
        }catch (Exception ex){
            System.err.println("------[ Exception catch exception of type NullPointerException ]-------");
        }

        try{
            throw new IOException("IOException");
        }catch (Exception ex){
            System.err.println("------[ Exception catch exception of type IOException ]-------");
        }
    }
}
