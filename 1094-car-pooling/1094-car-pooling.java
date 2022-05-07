class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       Arrays.sort(trips,Comparator.comparing(trip->trip[1])); 
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(trip->trip[2])); 
        for(int[] trip:trips){
            while(!pq.isEmpty()&&trip[1]>=pq.peek()[2]){  
              capacity+=pq.poll()[0];                    
            }
              capacity-=trip[0];    
            if(capacity<0) return false;
            pq.add(trip);       
          }
        return true;
    }
}