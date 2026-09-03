class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int l=0, r=nums.length-1, mid=nums.length;
        while (l<r) {
            mid = (r+l)/2;
            if(nums[r]>nums[mid])
                r=mid;
            else l=mid+1;
            System.out.println(l+","+mid+","+r);
        }
        return nums[l];
    }
}
