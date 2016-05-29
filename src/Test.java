import java.util.Arrays;

/**
 * 
 * @author Bobfeng
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {2,23,22,23,12,7};
        BubbleSort testBubble = new BubbleSort();
        System.out.println("The array after bubble sort is: ");
        System.out.println(Arrays.toString(testBubble.bubble(a)));
        
        int[] b = {2,23,22,23,12,7};
        SelectionSort testSelection = new SelectionSort();
        System.out.println("The array after selection sort is: ");
        System.out.println(Arrays.toString(testSelection.selection(b)));
        
        int[] c = {2,23,22,23,12,7};
        InsertionSort testInsertion = new InsertionSort();
        System.out.println("The array after insertion sort is: ");
        System.out.println(Arrays.toString(testInsertion.insertion(c)));
        
        int[] d = {2,23,22,23,12,7};
        QuickSort.quickSort(d, 0, d.length - 1);
        System.out.println("The array after quick sort is: ");
        System.out.println(Arrays.toString(d));
        
        int[] e = {2,23,22,23,12,7};
        MergeSort.mergeSort(e);
        System.out.println("The array after merge sort is: ");
        System.out.println(Arrays.toString(e));
    }

}
