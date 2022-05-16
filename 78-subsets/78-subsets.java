class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
    backtrack(new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<Integer> tempList, int [] nums, int start){
      list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]); 
        backtrack( tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
}