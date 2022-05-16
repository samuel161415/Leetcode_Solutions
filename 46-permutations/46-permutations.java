class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        helper(list,new ArrayList<>(),0,nums);
        return list;
    }

    public void helper(List<List<Integer>> list,List<Integer> li,int start,int [] nums){
        if(start==nums.length){
            list.add(new ArrayList<>(li));
        }
        for(int i=0;i<nums.length;i++){
            if(li.contains(nums[i])) continue;
            li.add(nums[i]);
            helper(list,li,start+1,nums);
            li.remove(li.size()-1);
        }
    }
}