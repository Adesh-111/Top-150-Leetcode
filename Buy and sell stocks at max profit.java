public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] arr){
        int cost =0;
        int max = 0;
        int min = arr[0];
        int profit = 0;
        for(int i =1; i< arr.length; i++){
            cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(arr[i], min);
        }
        return profit;
    }
}
