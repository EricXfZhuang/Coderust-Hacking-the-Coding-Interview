package Arrays;

/**
 * @Author EricZhuang
 * @Date 2020/8/5
 */
class Tuple<X, Y> {
    public X x;
    public Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}

public class StockPrices {
    public static Tuple findBuySellStockPrices(int[] array) {
        //TODO: Write - Your - Code
        Tuple<Integer, Integer> result = new Tuple<Integer, Integer>(-1, -1);
        int currBuy = array[0];
        int maxSell = array[1];
        int maxProfit = maxSell - currBuy;
        for(int i = 1; i < array.length; i++){
            int currentProfit = array[i] - currBuy;
            if(currentProfit > maxProfit){
                maxSell = array[i];
                maxProfit = currentProfit;
            }
            if(currBuy > array[i]){
                currBuy = array[i];
            }
        }
        result.x = maxSell - maxProfit;
        result.y = maxSell;
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 2, 5};
        Tuple result = null;
        result = findBuySellStockPrices(array);
        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result.x, result.y));

        int[] array2 = {8, 6, 5, 4, 3, 2, 1};
        result = findBuySellStockPrices(array2);
        System.out.println(String.format("Buy Price: %d, Sell Price: %d", result.x, result.y));

    }
}
