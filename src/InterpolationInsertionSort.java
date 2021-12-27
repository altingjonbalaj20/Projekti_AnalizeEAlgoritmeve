import java.util.LinkedList;

public class InterpolationInsertionSort {
    private BinaryInsertionSort binary = new BinaryInsertionSort();

    public LinkedList<Integer> sort(LinkedList<Integer> array){
        LinkedList<Integer> sortedArray = new LinkedList<>();
        sortedArray.add(array.removeFirst());
        while(!array.isEmpty()) {
            Integer element = array.removeFirst();
            //int index = interpolationSearchNoRec(array, element);
            int index = interpolationSearchRecursion(sortedArray, element, 0, sortedArray.size() - 1);
            sortedArray.add(index, element);
        }
        return sortedArray;
    }

    public int interpolationSearchNoRec(LinkedList<Integer> array, Integer element) {
        int left = 0;
        int right = array.size() - 1;
        if(array.get(left) >= element)
            return left;
        if(array.get(right) <= element)
            return right + 1;
        while (left <= right && element >= array.get(left) && element <= array.get(right)) {

            int pos = (int) (left + (((double)(right - left) / (array.get(right) - array.get(left)) * (element - array.get(left)))));

            if (array.get(pos) == element)
                return pos;

            if (array.get(pos) < element)
                left = pos + 1;

            else
                right = pos - 1;
        }
        System.out.println("Left : " + left + " Right: " + right);
        return binary.binarySearchRecursion(array, element, left, right);
    }

    public int interpolationSearchRecursion(LinkedList<Integer> array, Integer element, int left, int right){
        if(array.get(left) >= element)
            return left;
        if(array.get(right) <= element)
            return right + 1;

        if(element >= array.get(left) && element <= array.get(right) && left <= right){
            int pos = (int) (left + (((double)(right - left) / (array.get(right) - array.get(left)) * (element - array.get(left)))));

            if (element == array.get(pos))
                return pos;

            if (element > array.get(pos))
                return interpolationSearchRecursion(array, element, pos + 1, right);

            else
                return interpolationSearchRecursion(array, element, left, pos - 1);
        }
        return binary.binarySearchRecursion(array, element, left, right);
    }
}
