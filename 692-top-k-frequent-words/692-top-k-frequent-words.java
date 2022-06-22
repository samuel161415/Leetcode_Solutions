class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
           
        }
        List<String> list=new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(k,(a,b)->
                          a.getValue()==b.getValue()?a.getKey().compareTo(b.getKey()):b.getValue()-a.getValue());
          
        // if same frequency, then sort alphabetical .  
        
        for (Map.Entry<String,Integer> entry : map.entrySet() ) pq.add(entry);
         while (list.size() < k) list.add(pq.poll().getKey());  //add top k
        return list;
    }
}