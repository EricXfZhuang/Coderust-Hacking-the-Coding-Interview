package Math_Stats;

import java.util.List;
import java.util.Arrays;

public class FindMissing {
    static int findMissing(List<Integer> input) {
        //TODO: Write - Your - Code
        int sum = 0;
        for(int i = 0; i < input.size(); i++){
            sum += input.get(i);
        }
        int target = 0;
        for(int i = 0; i < input.size() + 1; i++){
            target += (i+1);
        }
        return target - sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,1,2,8,4,5);
        System.out.println("Original = " + list);
        int missingNumber = findMissing(list);
        System.out.println("The missing number is " + missingNumber);
    }
}
