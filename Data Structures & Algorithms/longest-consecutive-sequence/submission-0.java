class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int element : nums) {
            set.add(element);
        }
        System.out.println(set);
        Set<Integer> seqStart = new HashSet<>();
        for(Integer i: set) {
            if (!set.contains(i.intValue()-1))
                seqStart.add(i);
        }
        System.out.println(seqStart);
        int max=0;
        for (Integer i: seqStart) {
            int count = 0;
            int group = i.intValue();
            while(set.contains(group)) {
                group++;
                count++;
            }
            if(count > max)
                max=count;
        }
        return max;
    }
}
