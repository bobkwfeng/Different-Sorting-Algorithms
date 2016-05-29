/**
 * 
 * @author Bobfeng
 * Quick Sort
 */
public class QuickSort {
     public static void quickSort(int[] list, int low, int high) {
         // Special Case
         if (list == null || list.length == 0)
             return;
         // Validation
         if (low >= high)
             return;
         
         int i = low;
         int j = high;
         int mid = low + (high - low) / 2;
         int pivot = list[mid];
         while (i <= j) {
             // Skip
             while (list[i] < pivot) {
                 i++;
             }
             // Skip
             while (list[j] > pivot) {
                 j--;
             }
             if (i <=j) {
                 // Swap
                 int temp = list[i];
                 list[i] = list[j];
                 list[j] = temp;
                 i++;
                 j--;
             }
         }
         // Quit recursion
         if (low < j) {
             quickSort(list, low, j);
         }
         // Quit recursion
         if (high > i) {
             quickSort(list, i, high);
         }
     }
}
