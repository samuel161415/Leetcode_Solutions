class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        helper(candidates,target,0,new ArrayList<>());
        return list;
        
    }
    public void helper(int[] candidates,int target,int idx,List<Integer> l){
        if(target>0){
            for(int i=idx;i<candidates.length;i++){
                if (i > idx && candidates[i] == candidates[i-1]) continue; // no repetion is allowed
                l.add(candidates[i]);
                helper(candidates,target-candidates[i],i+1,l);
                l.remove(l.size()-1);
            }
        }
        if(target==0) {
            list.add(new ArrayList<>(l));
        }
    }
}