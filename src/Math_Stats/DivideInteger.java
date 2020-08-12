package Math_Stats;

public class DivideInteger {
    public static int integerDivide(int x, int y) {
        //TODO: Write - Your - Code
        int rs = 0;
        while(x >= y){
            x -= y;
            rs++;
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println( "7/2 = " + integerDivide(7, 2));
        System.out.println( "5/4 = " + integerDivide(5, 4));
        System.out.println( "1/3 = " + integerDivide(1, 3));
        System.out.println( "40/5 = " + integerDivide(40, 5));
        System.out.println( "40/4 = " + integerDivide(40, 4));
    }
}
