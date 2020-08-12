package Math_Stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PermuteString {
    static List<String> permuteString(String input) {
        //TODO: Write - Your - Code
        List<String> result = new ArrayList<String>();
        List<Character> candidates = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            candidates.add(input.charAt(i));
        }
        dfs(result, "", candidates);
        return result;
    }

    static void dfs(List<String> result, String currentStr, List<Character> candidates){
        if(candidates.isEmpty()){
            result.add(currentStr);
        }
        int len = candidates.size();
        for(int i = 0 ; i < len; i++){
            Character c = candidates.get(i);
            String temp = currentStr + c;
            candidates.remove(c);
            dfs(result, temp, candidates);
            candidates.add(i, c);
        }
    }

    public static void main(String[] args) {
        String input = "bad";
        System.out.println("All permutations of " + input);
        List<String> result = permuteString(input);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
