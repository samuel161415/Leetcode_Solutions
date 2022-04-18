class Solution {
    public int totalFruit(int[] fruits) {
        int slow=0,fast=0;
        int count=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(fruits[slow],0);
        while(fast<fruits.length){
            if(!map.containsKey(fruits[fast])&&map.size()==1){
                count++;
                map.put(fruits[fast],1);
                fast++;
            }
            else if(!map.containsKey(fruits[fast])&&map.size()>1){
                max=Math.max(max,count);
                map.put(fruits[slow],map.get(fruits[slow])-1);
                if(map.get(fruits[slow])==0) map.remove(fruits[slow]);
                slow++;
                count--;
            }
            else {
                map.put(fruits[fast],map.get(fruits[fast])+1);
                count++;
                fast++;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}