class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];
        Queue<Integer> q=new LinkedList<>();
        
        q.offer(start);
        
        while(!q.isEmpty()){
            int temp=q.poll();
            visited[temp]=true;
             
            if(arr[temp]==0) return true;
            int right=temp+arr[temp];
            int left=temp-arr[temp];
            if(right<arr.length&&!visited[right]){
                q.offer(right);
            }
            if(left>=0&&!visited[left]){
                q.offer(left);
            }
            
        }
        return false;
    }
}