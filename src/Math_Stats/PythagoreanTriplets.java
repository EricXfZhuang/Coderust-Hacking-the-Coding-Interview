package Math_Stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PythagoreanTriplets {
    static List<int[]> findPythagoreanTriplets(int[] arr) {
        //TODO: Write - Your - Code
        List<int[]> triplets = new ArrayList<int[]>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                int sum = arr[i] * arr[i] + arr[j] * arr[j];
                double sq = Math.sqrt(sum);
                int castSq = (int) sq;
                if(sq != castSq){
                    continue;
                }
                int pt = arr.length - 1;
                while(pt > j){
                    if(arr[pt] == castSq){
                        triplets.add(new int[]{arr[i], arr[j], arr[pt]});
                        break;
                    }else if(arr[pt] > castSq){
                        pt--;
                    }else{
                        break;
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] argv) {
        int[] l1 = {4,16,1,2,3,5,6,8,25,10};

        List<int[]> t1 = findPythagoreanTriplets(l1);

        System.out.println("Original: " + Arrays.toString(l1));
        String result = "";

        for (int[] a : t1) {
            Arrays.sort(a);
            result += "[";
            for (int x : a) {
                result += Integer.toString(x) + ",";
            }
            result = result.replaceAll(",$", "");
            result += "]";
        }
        System.out.println("Pythagorean triplets: " + result);
    }
}
