package ch06;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Q22 {
    public static int g() throws Exception {
        throw new Exception("ewew");
    }
    public static <V, T extends Throwable> V doWork(Callable<V> c, Function<String, T> func) throws T {
        try {
            return c.call();
        } catch(Throwable x) {
            //create previous exception
            T previousThrow = func.apply("doWork encountered fatal error.");
            previousThrow.initCause(x);
            throw previousThrow;
        }
    }

    public static void main(String[] args) {
        try {
            doWork(Q22::g, Exception::new);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
}
