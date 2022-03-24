package md.pentalog.tasks_part1.chapter11.Ex21;

import md.pentalog.tasks_part1.chapter11.Ex16.ExceptionA;

public class CatchingExceptions {
    public static void main(String[] args) {
        try {
            catchException();
        } catch (ExceptionA e) {
            System.err.println("---[ ExceptionA from method main ]---");
        }
    }

    public static void catchException() throws ExceptionA {
        double divide;
        try{
            divide = 3/0;
            throw new ExceptionA("ExceptionA");
        }catch(ArithmeticException ar){
            System.err.println("---[ Arithmetic exception from method body ]---");
        }
    }
}
