package Math_Stats;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    static void findKthPermutation(List<Character> v, int k, StringBuilder result) {
        //TODO: Write - Your - Code
        if(v.isEmpty())
            return;
        int n = v.size();
        int fac = factorial(n - 1);
        int selected = (k - 1) / fac;
        result.append(v.get(selected));
        v.remove(selected);
        k = k - selected * fac;
        findKthPermutation(v, k, result);
    }

    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

    static String getPermutation(int n, int k) {
        List<Character> v = new ArrayList<Character>();
        char c = '1';
        for (int i = 1; i <= n; ++i) {
            v.add(c);
            c++;
        }

        StringBuilder result = new StringBuilder();
        findKthPermutation(v, k, result);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("8th permutation of 1234 = " + getPermutation(4, 8));
    }
}
