package Arrays;

import java.util.Arrays;
/**
 * @Author EricZhuang
 * @Date 2020/8/6
 */
public class FindSum {
    static boolean findSumOfTwo(int[] A, int val) {
        //TODO: Write - Your - Code
        /*
        * version 1 -- two pointers:
        * 1. Sort the array
        * 2. Using two pointers, left and right, to modify if the sum is not equal to target
        * 3. left++ if sum is smaller than the target
        * 4. right-- if sum is greater than the target
        * */
        Arrays.sort(A);
        int left = 0, right = A.length - 1;
        while(left < right){
            int sum = A[left] + A[right];
            if(sum == val){
                return true;
            }else if(sum < val){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
