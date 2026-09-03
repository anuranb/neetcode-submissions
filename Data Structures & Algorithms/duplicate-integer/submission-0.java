class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if(freqMap.containsKey(nums[i]))
                return true;
            else
                freqMap.put(nums[i], 1);
        }
        return false;
    }
}