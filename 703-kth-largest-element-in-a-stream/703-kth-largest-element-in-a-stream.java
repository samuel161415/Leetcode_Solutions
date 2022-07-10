class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        for(int a:nums){
            pq.add(a);
            
        }
        this.k=k;
       
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>k){
            pq.remove();
        }
       return pq.peek();
    }
}

