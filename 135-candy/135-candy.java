class Solution {
    public int candy(int[] ratings) {
        int l=ratings.length;
        int[] lTr=new int[l];
        int[] rTl=new int[l];
        if(l==1) return 1;
        Arrays.fill(lTr,1);
        Arrays.fill(rTl,1);
        
        for(int i=1;i<l;i++){
            if(ratings[i]>ratings[i-1]) lTr[i]=lTr[i-1]+1;
        }
        
        for(int i=l-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) rTl[i]=rTl[i+1]+1;
        }
        int res=0;
        for(int i=0;i<l;i++){
            ratings[i]=Math.max(lTr[i],rTl[i]);
            res+=ratings[i];
        }
       
        return res;
    }
}