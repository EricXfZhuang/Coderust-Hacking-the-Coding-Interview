package Arrays;

import java.util.Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/5
 */
public class MoveZeros {
    static void moveZerosToLeft(int[] A) {
        //TODO: Write - Your - Code
        int numZero = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                numZero++;
            }
        }
        int count = 0;
        for(int i = A.length - 1; i >= 0; i--){
            if(A[i] == 0){
                count++;
            } else if(A[i] != 0){
                A[i + count] = A[i];
            }
            if(i < numZero){
                A[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] v = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(v));

        moveZerosToLeft(v);

        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));
    }
}
