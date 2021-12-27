import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(54);
        arr.add(6);
        arr.add(85);
        arr.add(54);
        arr.add(2);
        arr.add(154);

        System.out.println(arr);
        BinaryInsertionSort binary = new BinaryInsertionSort();
        InterpolationInsertionSort interpolation = new InterpolationInsertionSort();
        arr = interpolation.sort(arr);
        System.out.println(arr);
    }
}
