package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/4
 */
public class RotateArray {
    static void rotateArray(List<Integer> arr, int n) {
        //TODO: Write - Your - Code
        int len = arr.size();
        // Let's normalize rotations
        // if n > array size or n is negative.
        n = n % len;
        if (n < 0) {
            // calculate the positive rotations needed.
            n = n + len;
        }

        List<Integer> temp = Arrays.asList(new Integer[n]);

        // copy last N elements of array into temp
        for (int i = 0; i < n; i++) {
            temp.set(i, arr.get(len-n+i));
        }

        // shift original array
        for (int i = len - 1; i >= n; i--) {
            arr.set(i, arr.get(i-n));
        }

        // copy temp into original array
        for (int i = 0; i < n; i++) {
            arr.set(i, temp.get(i));
        }
    }

    public static void main(String []args){
        List<Integer> arr = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
        System.out.println("Array Before Rotation\n"+arr);
        rotateArray(arr, 2);
        System.out.println("Array After Rotation\n"+arr);
    }
}
