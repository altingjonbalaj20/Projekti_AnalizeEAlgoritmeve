import java.util.LinkedList;

public class BinaryInsertionSort {
    public LinkedList<Integer> sort(LinkedList<Integer> array){
        LinkedList<Integer> sortedArray = new LinkedList<>();
        sortedArray.add(array.removeFirst());
        while(!array.isEmpty()) {
            Integer element = array.removeFirst();
//            int index = binarySearchRecursion(sortedArray, element, 0, sortedArray.size() - 1);
          int index = binarySearchNoRec(sortedArray, element);
            sortedArray.add(index, element);
        }
        return sortedArray;
    }

    //rekursiv
    public int binarySearchRecursion(LinkedList<Integer> array, Integer element, int left, int right){
        if (right <= left)
            return (element > array.get(left)) ? (left + 1) : left;

        int mid = (left + right) / 2;

        if (element == array.get(mid))
            return mid + 1;

        if (element > array.get(mid))
            return binarySearchRecursion(array, element, mid + 1, right);

        return binarySearchRecursion(array, element, left, mid - 1);
    }

    //jorekursiv
    public int binarySearchNoRec(LinkedList<Integer> array, Integer element) {
        int left = 0;
        int right = array.size() - 1;
        int steps = 0;
        while (true) {
            if (right <= left)
                return (element >= array.get(left)) ? (left + 1) : left;

            int mid = (left + right) / 2;

            if (element == array.get(mid))
                return mid + 1;

            if (element > array.get(mid))
                left = mid + 1;

            else
                right = mid - 1;
        }
    }
}
