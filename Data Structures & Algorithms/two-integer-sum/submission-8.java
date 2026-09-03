class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> locationMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if (locationMap.containsKey(nums[i])) {
                result[0] = locationMap.get(nums[i]).intValue();
                result[1] = i;
                return result;
            }
            else locationMap.put(comp, i);
        }
      
        result[0]=0;
        result[1]=0;
        return result;
    }
}
