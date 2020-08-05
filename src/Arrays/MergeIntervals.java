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
        Pair prev = v.get(0);
        for(int i = 1; i < len; i++){
            Pair curr = v.get(i);
            if(prev.second >= curr.first){
                prev.second = Math.max(prev.second, curr.second);
            }else{
                result.add(prev);
                prev = curr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Pair> v = new ArrayList<Pair>();

        v.add(new Pair(1, 5));
        v.add(new Pair(3, 7));
        v.add(new Pair(4, 6));
        v.add(new Pair(6, 8));
        v.add(new Pair(10, 12));
        v.add(new Pair(11, 15));

        ArrayList<Pair> result = mergeIntervals(v);

        for(int i=0; i<result.size(); i++){
            System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
        }
    }
}
