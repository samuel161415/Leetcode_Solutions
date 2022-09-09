class Solution {
    public int numberOfWeakCharacters(int[][] p) {
        Arrays.sort(p,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        Stack<int[]> stack=new Stack<>();
          stack.push(p[0]);
                    int count=0;
          for(int i=1;i<p.length;i++){
              
            while(!stack.isEmpty()&&p[i][0]>stack.peek()[0]&&p[i][1]>stack.peek()[1]){ 
                stack.pop();
                count++; 
                         }
              
            stack.push(p[i]);
                    
                }
        return count;
    }
}