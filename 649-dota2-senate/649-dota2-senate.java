class Solution {
    public String predictPartyVictory(String senate) {

        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<senate.length();i++){
            map.put(senate.charAt(i),map.getOrDefault(senate.charAt(i),0)+1);
        }
        
        boolean[] visited=new boolean[senate.length()];
        char res='a';

        boolean removeR=false;
        boolean removeD=false;
        int countR=0;
        int countD=0;
        
        while(true){
             if(map.getOrDefault('R',0)!=0&&map.getOrDefault('D',0)==0){
                   res='R';
                  break;
              }
              else if(map.getOrDefault('D',0)!=0&&map.getOrDefault('R',0)==0) {
                  res='D';
                  break;
              }
            
          for(int i=0;i<senate.length();i++){
             char c=senate.charAt(i);
            if(removeR&&c=='R'&&!visited[i]){
                visited[i]=true;
                countR--;
                if(countR==0)
                removeR=false;
            }
             else if(removeD&&c=='D'&&!visited[i]){
                visited[i]=true;
                 countD--;
                 if(countD==0)
                 removeD=false;
            }
              else if(c=='R'&&!visited[i]){
                  if(map.get('D')==0) continue;
                  map.put('D',map.get('D')-1);
                  countD++;
                  removeD=true;
              }
              else if(c=='D'&&!visited[i]){
                  if(map.get('R')==0) continue;
                  countR++;
                  map.put('R',map.get('R')-1);
                  removeR=true;
                  
              }
              
          }
             
        }
        if(res=='R') return "Radiant";
        else return "Dire";
            
    }
}