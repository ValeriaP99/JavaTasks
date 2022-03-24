package md.pentalog.tasks_part1.chapter11.Ex20;

import md.pentalog.tasks_part1.chapter11.Ex16.ExceptionA;
import md.pentalog.tasks_part1.chapter11.Ex16.ExceptionB;

public class RethrowingExceptions {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (ExceptionB e) {
            System.err.println("Exception from someMethod");
        }
    }

    public static void someMethod() throws ExceptionB {
        try {
            someMethod2();
        } catch (ExceptionA e) {
            System.err.println("Exception from someMethod2");
        }
        throw new ExceptionB("ExceptionB");
    }

    public static void someMethod2() throws ExceptionA {
        throw new ExceptionA("ExceptionA");
    }
}
