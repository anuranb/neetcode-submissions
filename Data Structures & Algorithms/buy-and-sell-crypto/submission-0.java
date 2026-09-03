class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int maxpost[] = new int [l];
        int minpre[] = new int [l];
        int min=Integer.MAX_VALUE, max=0;
        for (int i=0; i<l; i++) {
            if(max < prices[l-i-1])
                max = prices[l-i-1];
            maxpost[l-i-1] = max;

            if(min > prices[i])
                min = prices[i];
            minpre[i] = min;
        }
        max = 0;
        for (int i=0; i<l; i++) {
            if(maxpost[i]-minpre[i] > max)
                max = maxpost[i]-minpre[i];
            System.out.println(maxpost[i]);
            System.out.println(minpre[i]);
        }
        
        return max;
    }
}
