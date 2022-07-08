class Solution {
    public List<Integer> pancakeSort(int[] arr) {
       List<Integer> result = new ArrayList<>();
        int n = arr.length, largest = n;
        for (int i = 0; i < n; i++) {
            int index = findMaxIdx(arr, largest);
            reverse(arr, index);
            reverse(arr, largest - 1);
            result.add(index + 1);
            result.add(largest--);
        }
        return result;
    }
   
    public int findMaxIdx(int[] arr,int target){
      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public void reverse(int[] arr,int idx){
        int s=0;
        int e=idx;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        
        
    }
}