package Math_Stats;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    static void findKthPermutation(List<Character> v, int k, StringBuilder result) {
        //TODO: Write - Your - Code
        int n = v.size();
        int fac = factorial(n);
        System.out.println("k: " + k);
        while(n > 0){
            int pick = fac / n;
            result.append(v.get(k % pick));
            v.remove(k % pick);
            fac /= n;
            n--;
            k %= pick;
        }
    }

    static int factorial(int n){
        if(n == 1){
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
