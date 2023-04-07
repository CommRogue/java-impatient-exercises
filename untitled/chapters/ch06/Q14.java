package ch06;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

public class Q14 {
    public static <T extends Closeable> void closeAll(ArrayList<T> arr) throws IOException {
        IOException curException = null;
        for (Closeable element : arr) {
            try {
                element.close();
            }
            catch(IOException e) {
                e.initCause(curException);
                curException = e;
            }
        }
        if(curException != null) {
            throw curException;
        }
    }
    public static void main(String[] args) {

    }
}
