class Solution {
    public long getDescentPeriods(int[] prices) {
        long r = prices.length;
        int m = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] - prices[i] == 1) {
                r += (1*m);
                m++;
            } else {
                m = 1;
            }
        }
        
        return r;
    }
}