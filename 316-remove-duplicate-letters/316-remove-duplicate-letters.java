class Solution {
    public String removeDuplicateLetters(String s) {
       Map<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        Stack<Character> stack=new Stack<>();
        boolean[] visited=new boolean[26];
        stack.push(s.charAt(0));
        int val=s.charAt(0);
        visited[val%97]=true;
        map.put(s.charAt(0),map.get(s.charAt(0))-1);
        
        for(int i=1;i<s.length();i++){
            char temp=stack.peek();
            char c=s.charAt(i);
            int valPeek=temp;
            int valC=c;
            
            if(!visited[valC%97]){
                
                while(!stack.isEmpty()&&stack.peek()>c){
                    if(map.get(stack.peek())==0) break;
                    valPeek=stack.pop();
                    visited[valPeek%97]=false;
                 }
                    stack.push(c);
                    visited[valC%97]=true;
                   
                }
             map.put(c,map.get(c)-1);
            }
            
        
           StringBuilder sb=new StringBuilder();
            while(!stack.isEmpty()){
            sb.append(stack.pop());
              }
              sb.reverse();
          
        return sb.toString();
        
        
    }
}