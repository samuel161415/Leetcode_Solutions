class Solution {
     List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates);
        helper(new ArrayList<>(),0,target,candidates);
        return list;
    }
    public void helper(List<Integer> l,int idx,int target,int[] candidates){
     
        if(target>0){
            for(int i=idx;i<candidates.length;i++){
                l.add(candidates[i]);
                helper(l,i,target-candidates[i],candidates);
                l.remove(l.size()-1);
            }
        }
        else if(target==0) list.add(new ArrayList<>(l));
        
        
    }
    
}