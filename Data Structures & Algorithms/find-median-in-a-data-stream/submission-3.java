class MedianFinder {
    PriorityQueue<Double> maxHeap;
    PriorityQueue<Double> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b,a));
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        double val = (double) num;
        if (maxHeap.size() == 0) maxHeap.offer(val);
        else if(val > maxHeap.peek()) {
            minHeap.offer(val);
        } else {
            maxHeap.offer(val);
        }

        while (Math.abs(minHeap.size() - maxHeap.size()) >1) {
            if(maxHeap.size() > minHeap.size() ) {
                minHeap.offer(maxHeap.poll());
            } else {
                maxHeap.offer(minHeap.poll());
            }
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()) {
            return ( maxHeap.peek()+ minHeap.peek())/2;
        } else if(maxHeap.size() > minHeap.size()) return maxHeap.peek();
        else return minHeap.peek();
    }
}
