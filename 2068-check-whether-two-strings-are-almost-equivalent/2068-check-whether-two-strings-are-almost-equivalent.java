import java.util.*;;
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
       HashMap<Character,Integer> map=new HashMap<>(); 
        
        int count1=0,count2=0;
        char w1[]=word1.toCharArray();
        char w2[]=word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        char s1=w1[0];
        char s2=w2[0];
        
        System.out.println(s1+" s2 "+s2);
        for(int i=0;i<w1.length;i++){
            if(s1==w1[i]) count1++;
            else{
                 map.put(s1, Math.abs( map.getOrDefault(s1, 0) -count1));
                s1=w1[i];
                count1=1;
            }
            if(s2==w2[i]) count2++;
            else{
                map.put(s2, Math.abs( map.getOrDefault(s2, 0) -count2));
                s2=w2[i];
                count2=1;
                
            }
            
        }
       map.put(s1, Math.abs( map.getOrDefault(s1, 0) -count1));
       map.put(s2, Math.abs( map.getOrDefault(s2, 0) -count2));
        System.out.println(map);
        for (int res : map.values()) 
        {
            System.out.println(res);
             if(res>3) return false;
        }
          return true;
        
    }
}