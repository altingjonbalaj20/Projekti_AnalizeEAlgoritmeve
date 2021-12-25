import java.util.LinkedList;

public class InterpolationInsertionSort {

    public LinkedList<Integer> sort(LinkedList<Integer> array){
        LinkedList<Integer> sortedArray = new LinkedList<>();
        sortedArray.add(array.removeFirst());
        while(!array.isEmpty()) {
            Integer element = array.removeFirst();
//            int index = interpolationSearchRecursion(sortedArray, element,0, sortedArray.size() - 1);
            int index = interpolationSearchNoRec(sortedArray, element);
            sortedArray.add(index, element);
        }
        return sortedArray;
    }

    public int interpolationSearchRecursion(LinkedList<Integer> array, Integer element, int left, int right){
        if(element >= array.get(left) && element <= array.get(right) && left <= right){
            int pos = left + (element - array.get(left)) * (right - left) / (array.get(right) - array.get(left));

            if (left == right) {
                return (element > left) ? (left + 1) : left;
            }

            if (element == array.get(pos))
                return pos;

            if (element > array.get(pos))
                return interpolationSearchRecursion(array, element, pos + 1, right);

            else
                return interpolationSearchRecursion(array, element, left, pos - 1);
        }
        return left;
    }

    public int interpolationSearchNoRec(LinkedList<Integer> array, Integer element) {
        int left = 0;
        int right = array.size() - 1;
        while (element >= array.get(left) && element <= array.get(right) && left <= right) {
            if (left >= right) {
                return (element > left) ? (left + 1) : left;
            }

            int pos = left + (element - array.get(left)) * (right - left) / (array.get(right) - array.get(left));

            if (element == array.get(pos))
                return pos + 1;

            if (element > array.get(pos))
                left = pos + 1;

            else
                right = pos - 1;
        }
        return new BinaryInsertionSort().binarySearchRecursion(array, element, left, right);
    }
}
