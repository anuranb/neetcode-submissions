class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(freqMap.containsKey(nums[i]))
                freqMap.put(nums[i], freqMap.get(nums[i])+1);
            else 
                freqMap.put(nums[i], 1);
        }

        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            int freqCompare = Integer.compare(b.getValue(), a.getValue());
            if(freqCompare!=0) return freqCompare;
            return a.getKey().compareTo(b.getKey());
        });

        pq.addAll(freqMap.entrySet());

        int karr[] = new int [k];
        int count=0;
        while(count<k) {
            karr[count++]=pq.poll().getKey();
        }
        return karr;
    }
}
