package Math_Stats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubsets {
    static void findAllSubsets(List<Integer> v, List<HashSet<Integer>> sets) {
        //TODO: Write - Your - Code
        sets.add(new HashSet<>());
        for(int pt1 = 0; pt1 < v.size(); pt1++){
            findAllSubsets(pt1, v, sets, new HashSet<Integer>());
        }
    }

    static void findAllSubsets(int pt2, List<Integer> v, List<HashSet<Integer>> sets, HashSet<Integer> currentSet){
        if(pt2 == v.size()){
            return;
        }

        currentSet.add(v.get(pt2));
        HashSet<Integer> newSet = (HashSet)currentSet.clone();
        sets.add(newSet);
        findAllSubsets(++pt2, v, sets, currentSet);
    }

    public static void main(String[] args) {
        Integer[] myints = new Integer[] {2,5,7};
        List<Integer> v = new ArrayList<Integer>();
        for (Integer i : myints) {
            v.add(i);
        }
        List<HashSet<Integer>> subsets = new ArrayList<HashSet<Integer>>();

        findAllSubsets(v, subsets);

        for (int i = 0; i < subsets.size(); ++i) {
            System.out.print("{ ");
            for (Integer it : subsets.get(i)) {
                System.out.print(it + " ");
            }
            System.out.println("}");
        }
    }
}
