class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        
        for(int i=0;i<l.length;i++){
          int[] copy=Arrays.copyOfRange(nums, l[i],r[i]+1);
            Arrays.sort(copy);
            int prev=copy[1]-copy[0];
            boolean temp=true;
            for(int j=1;j<copy.length-1;j++){
                if(copy[j+1]-copy[j]!=prev){
                    temp=false;
                    break;
                }
                
            }
            list.add(temp);
            
        }
        return list;
    }
}