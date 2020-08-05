package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author EricZhuang
 * @Date 2020/8/2
 */
public class MaxSlidingWindow {
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> list = new LinkedList<>();
        for(int windowStart = 0; windowStart < arr.length - windowSize; windowStart++){

        }
        //Write your code
        return result;
    }
}
