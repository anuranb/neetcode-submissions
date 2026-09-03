class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int element : nums) {
            set.add(element);
        }
        int max=0;
        for(Integer i: set) {
            if (!set.contains(i.intValue()-1)) {
                int count = 0;
                int group = i.intValue();
                while(set.contains(group)) {
                    group++;
                    count++;
                }
                if(count > max)
                    max=count;
            }
        }
        return max;
    }
}
