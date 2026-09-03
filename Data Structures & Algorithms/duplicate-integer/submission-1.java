class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> freqMap = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            if(freqMap.contains(nums[i]))
                return true;
            else
                freqMap.add(nums[i]);
        }
        return false;
    }
}