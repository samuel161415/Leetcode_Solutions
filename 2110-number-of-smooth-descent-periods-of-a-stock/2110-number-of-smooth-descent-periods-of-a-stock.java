class Solution {
    public long getDescentPeriods(int[] prices) {
        long result = prices.length;
        int temp = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] - prices[i] == 1) {
                result += (1*temp);
                temp++;
            } else {
                temp = 1;
            }
        }
        
        return result;
    }
}