class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=1, r=1;
        int prefix[] = new int[nums.length];
        int postfix[] = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            l*=nums[i];
            r*=nums[nums.length-i-1];
            prefix[i]=l;
            postfix[nums.length-i-1]=r;
        }
        int result[]=new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int pre=i-1<0?1:prefix[i-1];
            int post=i+1>=nums.length?1:postfix[i+1];
            result[i]=pre*post;
        }
        return result;
    }
}  
