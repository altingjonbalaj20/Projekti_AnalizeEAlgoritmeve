import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algorithm Started, number of elements is 100000");
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        // System.out.println(arr);
        long startTime = System.nanoTime();
        BinaryInsertionSort binary = new BinaryInsertionSort();
        InterpolationInsertionSort interpolation = new InterpolationInsertionSort();
        arr = interpolation.sort(arr);
        // arr = binary.sort(arr);
        long endTime = System.nanoTime();
        System.out.println("Algorithm has ended, time taken is " + (endTime - startTime) + " nanoseconds or "
                + ((endTime - startTime) / 1000000000.0) + " seconds");
        // System.out.println(arr);
        /**
         * 10^1 -> 1907000, 0.001 ,, 2
         * 10^2 -> 3255800, 0.003 ,, 3
         * 10^3 -> 10277200, 0.01 ,, 111
         * 10^4 -> 1141156500, 1.14 ,, 267y
         * 10^5 -> 305295471000, 305 ,,
         */
    }
}
