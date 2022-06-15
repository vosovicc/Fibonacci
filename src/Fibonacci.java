import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Через For: " + Arrays.toString(findFibWithFor(n)));
        System.out.println("Через While: " + Arrays.toString(findFibWithWhile(n)));
        System.out.println("Через Do...While: " + Arrays.toString(findFibWithDoWhile(n)));
    }

    public static long[] findFibWithFor(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static long[] findFibWithWhile(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        array[1] = 1;
        int i = 2;
        while (i <= n) {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        }
        return array;
    }

    public static long[] findFibWithDoWhile(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        array[1] = 1;
        int i = 2;
        do {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        } while (i <= n);
        return array;
    }
}
