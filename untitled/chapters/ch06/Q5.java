package ch06;

public class Q5 {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
    public static void main(String[] args) {
        Double[] result = Q5.<Double>swap(0, 1, 1.5, 2.0, 3.0);
    }
}
