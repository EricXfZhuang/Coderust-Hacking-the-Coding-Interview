package Arrays;

import java.util.Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/6
 */
public class QuickSort {
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int swapIndex = left;

        for(int i = left; i <= right; i++){
            if(arr[i] < pivot){
                int temp = arr[swapIndex];
                arr[swapIndex++] = arr[i];
                arr[i] = temp;
            }
        }

        arr[right] = arr[swapIndex];
        arr[swapIndex] = pivot;

        return swapIndex;
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    static void quickSort(int[] arr) {
        int left = 0, right = arr.length - 1;
        quickSort(arr, left, right);
    }

    public static void main(String[] args) {
        int[] a = new int[] {55, 23, 26, 2, 18, 78, 23, 8, 2, 3};

        System.out.print("Before Sorting\n");
        System.out.print(Arrays.toString(a) + "\n");

        quickSort(a);

        System.out.print("After Sorting\n");
        System.out.print(Arrays.toString(a));
    }
}
