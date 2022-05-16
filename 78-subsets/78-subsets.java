class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
    //List<List<Integer>> list = new ArrayList<>();
    //Arrays.sort(nums);
    backtrack(new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<Integer> tempList, int [] nums, int start){
   // System.out.println("initial "+tempList);
      list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]); 
       // System.out.println("after added "+tempList+" index "+i);
        backtrack( tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
       // System.out.println("removed "+tempList);
    }
}
}