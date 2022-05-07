class Solution {
    public boolean find132pattern(int[] nums) {
       Stack<Integer> stack=new Stack();  // use to second and third elements
       int third=Integer.MIN_VALUE;     // third will contains the third element i.e it's value is greater than first and less than second
        for(int i=nums.length-1;i>=0;i--){ 
            if(nums[i]<third) return true;
            while(!stack.isEmpty()&&nums[i]>stack.peek())
                third=stack.pop();
                
            
            stack.push(nums[i]);
        }
        return false;
    }
}