package Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/2
 */
public class BinarySearch {
    /*
    * Time Complexity: O(logn)
    * Space Complexity: O(1)
    * */
    public static int binarySearch(int[] a, int key){
        int left = 0;
        int right = a.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            System.out.println(a[mid]);
            if(a[mid] == key){
                return mid;
            }else if(a[mid] < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String []args){
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int[] inputs = {10, 49, 99, 110, 176};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("binSearch(arr, " + inputs[i]+ ") = " +  binarySearch(arr, inputs[i]));
        }
    }
}
