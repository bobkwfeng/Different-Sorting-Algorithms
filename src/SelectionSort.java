/**
 * 
 * @author Bobfeng
 * SelectionSort Sort
 */
public class SelectionSort {
    /**
     * 
     * @param x the original array
     * @return the array after sort
     */
    int[] selection(int[] x) {
        // record the tmp minimum index
        for (int j = 0; j < x.length; j++) {
            int min = j;
            for (int i = j; i < x.length; i++) {
                if (x[i] < x[min]) {
                    min = i;
                }
            }
            if (j != min) {
                swap(x, j, min);
            }
        }
        return x;
    }
    
    /**
     * 
     * @param x the array
     * @param a the index needed to be sorted
     * @param b the index needed to be sorted
     */
    private void swap (int[] x, int a, int b) {
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

}
