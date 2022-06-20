import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> hash=new HashMap<>();
        int[] array=new int[k];
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);   
        }
        int j=0;
       while(k>0){
           int idx=0;
        int maxFreq=0;                       // basically it does is first store values with their corrosponding frequencies
           for(int i:hash.keySet()){         // then according to that frequency d
              if(hash.get(i)>maxFreq) {      // thake the most frequent element and set to array and remove from hash
                  maxFreq=hash.get(i);
                  idx=i;
              }    
           }
               array[j++]=idx;
               hash.remove(idx);
               k--;
       }
    return array;
    }
}