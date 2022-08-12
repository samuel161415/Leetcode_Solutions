class Solution {
    public int hIndex(int[] citations) {
        int left=0;
        int right=citations.length-1;
        int mid=0;
        int l=citations.length;
        while(left<=right){
            mid=left+(right-left)/2;
            if(citations[mid]==l-mid) {
                return citations[mid];
            }
            else if(citations[mid]>l-mid) right=mid-1;
            else left=mid+1;
        }
        return l-left;
    }
}