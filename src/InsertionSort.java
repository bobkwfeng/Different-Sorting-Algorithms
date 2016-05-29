/**
 * 
 * @author Bobfeng
 * Insertion Sort
 */
public class InsertionSort {
    int[] insertion (int[] x) {
        for (int j = 1; j < x.length; j++) {
           int tmp = x[j];
           int i = j;
           while (i > 0 && tmp < x[i - 1]) {
               x[i] = x[i - 1];
               i--;
           }
           x[i] = tmp;
        }
        return x;
    }
}
