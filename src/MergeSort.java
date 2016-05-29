/**
 * 
 * @author Bobfeng
 * Merge Sort
 */
public class MergeSort {
    // Divide part
    public static int[] mergeSort (int[] list) {
        // base case
        if (list.length <= 1) {
            return list;
        }
        // divede the arrag
        int[] first = new int [list.length / 2];
        int[] second = new int [list.length - first.length];
        // Copy into two lists
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        // Recursion
        mergeSort(first);
        mergeSort(second);
        merge(first, second, list);
        return list;
    }
    
    // Merge Part
    public static void merge (int[] first, int[] second, int[] result) {
        int start1 = 0;
        int start2 = 0;
        int i = 0;
        while (start1 < first.length && start2 < second.length) {
            if (first[start1] < second[start2]) {
               result[i] = first[start1]; 
               start1++;
            } else {
                result[i] = second[start2];
                start2++;
            }
            i++;
        }
        // Add the remaining part.
        System.arraycopy(first, start1, result, i, first.length - start1);
        System.arraycopy(second, start2, result, i, second.length - start2);
    }
}
