package Arrays;

import java.util.List;
import java.util.Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/4
 */
public class FindLowHigh {
    static int findLowIndex(List<Integer> arr, int key) {
        //TODO: Write - Your - Code
        int left = 0, right = arr.size() - 1;
        int rs = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int ele = arr.get(mid);
            if(ele == key){
                rs = mid;
                right--;
            }else if(ele < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return rs;
    }

    static int findHighIndex(List<Integer> arr, int key) {
        //TODO: Write - Your - Code
        int left = 0, right = arr.size() - 1;
        int rs = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int ele = arr.get(mid);
            if(ele == key){
                rs = mid;
                left++;
            }else if(ele < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4,4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
        int key = 5;
        int low = findLowIndex(array, key);
        int high = findHighIndex(array, key);
        System.out.println("Low Index of " + key + ": " + low);
        System.out.println("High Index of " + key + ": " + high);

        key = -2;
        low = findLowIndex(array, key);
        high = findHighIndex(array, key);
        System.out.println("Low Index of " + key + ": " + low);
        System.out.println("High Index of " + key + ": " + high);
    }
}
