class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> hash=new HashMap<>();
        int slow=0;
        int fast=0;
        int max=0;
        while(fast<s.length()){
            if(hash.containsKey(s.charAt(fast))) {
            slow=Math.max(hash.get(s.charAt(fast))+1,slow); //basically done by subtracing  the occured 
            }                                               // taking maximum of all substring values
            hash.put(s.charAt(fast),fast);
            max=Math.max(max,fast-slow+1);
            fast++;   
        }
    
        return max;
    }
}