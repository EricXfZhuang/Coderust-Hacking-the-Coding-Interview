package Arrays;

import java.util.ArrayList;

/**
 * @Author EricZhuang
 * @Date 2020/8/5
 */
class Pair{
    public int first;
    public int second;

    public Pair(int x, int y){
        this.first = x;
        this.second = y;
    }
}

public class MergeIntervals {
    static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
        ArrayList<Pair> result = new ArrayList<Pair>();
        // write your code here
        int len = v.size();
        int end = v.get(len-1).second;
        while(true){

        }
        return result;
    }
}
