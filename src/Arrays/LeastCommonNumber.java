package Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/4
 */
public class LeastCommonNumber {
    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        //TODO: Write - Your - Code
        int pt0 = 0, pt1 = 0, pt2 = 0;
        int num0 = arr1[0], num1 = arr2[0], num2 = arr3[0];
        while(pt0 < arr1.length && pt1 < arr2.length && pt2 < arr3.length){
            if(num0 == num1 && num1 == num2){
                return num0;
            }
            if(num0 <= num1 && num0 <= num2){
                pt0++;
            }else if(num1 <= num0 && num1 <= num2){
                pt1++;
            }else if(num2 <= num0 && num2 <= num1){
                pt2++;
            }
            num0 = arr1[pt0];
            num1 = arr2[pt1];
            num2 = arr3[pt2];
        }
        return -1;
    }

    public static void main(String []args){
        int[] v1 = new int[]{6, 7, 10, 25, 30, 63, 64};
        int[] v2 = new int[]{1, 4, 5, 6, 7, 8, 50};
        int[] v3 = new int[]{1, 6, 10, 14};

        Integer result = findLeastCommonNumber(v1, v2, v3);
        System.out.println("Least Common Number: " + result);
    }
}
