class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
          if(!s.substring(i+1).contains(Character.toString(s.charAt(i)))&&!set.contains(s.charAt(i))) return i;
            set.add(s.charAt(i));
        }
        if(set.contains(s.charAt(s.length()-1))) return -1;
        return s.length()-1;
        
    }
}