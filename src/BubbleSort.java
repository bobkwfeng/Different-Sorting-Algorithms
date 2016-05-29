/**
 * 
 * @author Bobfeng
 * Bubble Sort
 */
public class BubbleSort {
    /**
     * 
     * @param x the original array
     * @return the array after sort
     */
    int[] bubble (int[] x) {
        for (int j = x.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (x[i] > x[i + 1]) {
                    swap(x, i, i + 1);
                }
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
