class BuySell{
    //if the current day is less we should buy and then sell
    static int profit(int [] prices){
        if (prices == null || prices.length == 0){
            return 0;
        }

        int profit = 0;
        for(int i = 0; i < prices.length - 1 ; i++){
            if (prices[i+1] > prices[i]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;


    }

    public static void main(String args[]){
        int [] days = {1,5,3,6,4,8};
        System.out.println(profit(days));
    }
}