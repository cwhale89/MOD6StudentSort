import java.util.ArrayList;
import java.util.Comparator;

/**
 * Utility class that provides a generic selection sort implementation.
 * Works with any objects that can be compared using a Comparator.
 */
public class SelectionSort {

    /**
     * Sorts a list of objects using the selection sort algorithm.
     *
     * @param <T>        the type of objects in the list
     * @param list       the list to be sorted
     * @param comparator the comparator defining the sort order
     */
    public static <T> void selectionSort(ArrayList<T> list, Comparator<T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap elements
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
