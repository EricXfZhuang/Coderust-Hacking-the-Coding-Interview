package Arrays;

import java.util.List;

/**
 * @Author EricZhuang
 * @Date 2020/8/4
 */
public class FindLowHigh {
    static int findLowIndex(List<Integer> arr, int key) {
        //TODO: Write - Your - Code
        return -2;
    }

    static int findHighIndex(List<Integer> arr, int key) {
        //TODO: Write - Your - Code
        int left = 0, right = arr.size() - 1;
        int rs = -2;
        while(left <= right){
            int mid = left + (right + 1 - left) / 2;
            if(arr.get(mid) == key){

            }
        }
        return -2;
    }
}
