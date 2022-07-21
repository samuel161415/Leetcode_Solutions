class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<temperatures.length;i++){
           while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                 map.put(stack.peek(),i-stack.peek());
                  stack.pop();
              }
               
            stack.push(i);    
        }
        int[] res=new int[temperatures.length];
        for(int i=0;i<res.length;i++){
            if(map.containsKey(i)) res[i]=map.get(i);
        }
        return res;
    }
}