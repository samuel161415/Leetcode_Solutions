class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
            
        }
        System.out.println(pq);
        while(pq.size()>1){
            int temp1=pq.remove();
            int temp2=pq.remove();
            if(temp1>temp2) pq.add(temp1-temp2);
            
        }
        if(pq.size()!=0) return pq.remove();
        else return 0;
    }
}