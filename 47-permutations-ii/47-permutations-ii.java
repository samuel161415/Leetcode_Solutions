class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        List<List<Integer>> dList=new ArrayList<>();
        per(list,0,list.size()-1,dList);
        List<List<Integer>> result=new ArrayList<>();
        for(List<Integer> l:dList){
            if(!result.contains(l)) result.add(new ArrayList<>(l));
        }
        return result;
    }

    public void per(List<Integer> list, int l,int e,List<List<Integer>> dList){
        if(l==e){
             dList.add(new ArrayList<>(list));
           // return;
        }
        else{
            for(int i=l;i<list.size();i++){
              list=swap(list,l,i);
                per(list,l+1,e,dList);
               list=swap(list,l,i);
            }
        }
    }
    public List<Integer> swap(List<Integer> list,int l, int e){
        int temp=list.get(l);
          list.set(l,list.get(e));
        list.set(e,temp);
        return list;
    }
}