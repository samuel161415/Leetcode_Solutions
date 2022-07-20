class Solution {
    public int numRescueBoats(int[] people, int limit) {
   Arrays.sort(people);
        int count=0;
        int start=0;
        int end=people.length-1;
        
        while(start<end){
            if(people[start]>limit) break;
            int sum=people[start]+people[end];
           if(sum>limit) end--;
            else{
             start++;
                end--;
            }
            count++;
        }
        if(start==end) count++;
        return count;
    }
}