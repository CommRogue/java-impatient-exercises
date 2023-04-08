package ch06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.lang.String;

public class Q23 {
    @SuppressWarnings("unchecked")
    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw (T) e; // The cast is erased to (Throwable) e
    }
    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            Q23.throwAs(ex);
            return null;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> s = Class.forName("java.lang.String");
    }
}
