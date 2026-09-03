class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1, max=0;
        while(l<r) {
            int lh = heights[l];
            int rh = heights[r];

            int vol;

            if(lh<rh)
                vol = lh * (r-l);
            else
                vol = rh * (r-l);
                
            if(vol>max)
                max = vol;

            if(rh>lh)
                l++;
            if(rh<lh)
                r--;
            if(rh==lh) {
                if(heights[l+1]>heights[r-1])
                    l++;
                else
                    r--;
            }    
        }
        return max;
    }
}
