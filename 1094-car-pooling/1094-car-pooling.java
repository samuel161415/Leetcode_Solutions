class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       Arrays.sort(trips,Comparator.comparing(trip->trip[1])); // sort according to starting position
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(trip->trip[2])); // store according to 
        for(int[] trip:trips){
            while(!pq.isEmpty()&&trip[1]>=pq.peek()[2]){  // if next trip's starting pos> previous end some passangers need to  
              capacity+=pq.poll()[0];                    // drop off from car and capacity increases
            }
              capacity-=trip[0];     // adding passangers to car will decrease cars capacity
            if(capacity<0) return false;
            pq.add(trip);       // puting the current element into priority queue
          }
        return true;
    }
}