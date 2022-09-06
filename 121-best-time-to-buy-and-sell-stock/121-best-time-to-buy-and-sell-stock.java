class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int first=0;
        int second=1;
        if(prices.length==1) return 0;
        while(second<prices.length){
            if(prices[first]<prices[second]){
                max=Math.max(max,prices[second]-prices[first]);
            }
            else{
                first=second;
            }
            second++;
        }
        return max;
    }
}