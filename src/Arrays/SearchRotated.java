package Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/3
 */
public class SearchRotated {
    static int binarySearchRotated(int[] arr,int key) {
        //TODO: Write - Your - Code
        int left = 0, right = arr.length - 1;
        // find the rotated position
        while(left <= right){
            int mid = left + (right + 1 - left) / 2;
            if(key == arr[mid]){
                return mid;
            }else if(arr[left] <= arr[mid] && arr[left] <= key && key < arr[mid]){
                right = mid - 1;
            }else if(arr[mid] <= arr[right] && arr[mid] < key && key <= arr[right]){
                left = mid + 1;
            }else if(arr[left] <= arr[mid]){
                left = mid + 1;
            }else if(arr[mid] <= arr[right]){
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String []args){
        int[] v1 = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("Key(3) found at: " + binarySearchRotated(v1, 3));
        System.out.println("Key(6) found at: " + binarySearchRotated(v1, 6));

        int[] v2 = {4, 5, 6, 1, 2, 3};
        System.out.println("Key(3) found at: " + binarySearchRotated(v2, 3));
        System.out.println("Key(6) found at: " + binarySearchRotated(v2, 6));
    }
}
