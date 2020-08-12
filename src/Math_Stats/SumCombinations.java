package Math_Stats;

import java.util.ArrayList;
import java.util.List;

public class SumCombinations {
    static ArrayList<ArrayList<Integer>> printAllSum(int target) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        dfsPlusPruning(output, tempList, target, 1, 0);
        return output;
    }

    static void dfsPlusPruning(ArrayList<ArrayList<Integer>> output, ArrayList<Integer> tempList, int target, int start, int currentSum){
        if(currentSum == target){
           output.add((ArrayList)tempList.clone());
        }

        for(int i = 1; i < target; i++){
            int tempSum = currentSum + i;
            if(tempSum <= target){
                tempList.add(i);
                dfsPlusPruning(output, tempList, target, start, tempSum);
                tempList.remove(tempList.size() - 1);
            }else{
                return;
            }
        }
    }

    static String print(ArrayList<ArrayList<Integer>> arr) {
        String result = "";
        for (int i = 0; i < arr.size(); i++) {
            result += "[";
            for (int j = 0; j < arr.get(i).size(); j++) {
                result += Integer.toString(arr.get(i).get(j)) + ",";
            }
            result = result.replaceAll(",$", "");
            result += "]";
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> result = printAllSum(n);
        System.out.println("All sum combinations of " + n );
        System.out.println(print(result));
    }
}
