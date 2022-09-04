class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int[] res=new int[arr1.length];
         int j=0;
        for(int i=0;i<arr2.length;i++){
            int count=map.get(arr2[i]);
            int idx=0;
           
            while(idx<count){
                res[j]=arr2[i];
                idx++;
                j++;
            }
            map.remove(arr2[i]);
        }
        List<Integer> list=new ArrayList<>();
          for (Map.Entry<Integer,Integer> entry : map.entrySet()){
              int count=entry.getValue();
              int idx=0;
              while(idx<count){
                  list.add(entry.getKey());
                  idx++;
              }
          }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            res[j]=list.get(i);
                  j++;
        }
        return res;
        
        
        
        
    }
}