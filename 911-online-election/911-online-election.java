class TopVotedCandidate {
      int []persons;
      int [] times;
     int[] leadMax;
    public TopVotedCandidate(int[] persons, int[] times) {
       leadMax=new int[persons.length];
        Map<Integer,Integer> map=new HashMap<>();
      this.persons=persons;
      this.times=times;
        leadMax[0]=persons[0];
        map.put(persons[0],1);
        for(int i=1;i<persons.length;i++){
            map.put(persons[i],map.getOrDefault(persons[i],0)+1);
            if(leadMax[i-1]==persons[i]||map.get(persons[i])>=map.get(leadMax[i-1]))                            leadMax[i]=persons[i];
            else{
            leadMax[i]=leadMax[i-1];
            }
            
        }
      
    }
    
    public int q(int t) {
        
        int right=times.length-1;
        int left=0;
        int mid=0;
        int res=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(this.times[mid]==t) {
                res=mid;
                break;
            }
            else if(times[mid]<t){
                res=Math.max(mid,res);
                left=mid+1;
            }
            else right=mid-1;
        }
        
        return leadMax[res];
        
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */