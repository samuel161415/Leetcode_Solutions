class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        map={}
        for i in range(len(arr2)):
            map[arr2[i]]=i
        
        arr1.sort(key = lambda x:(map.get(x, x+1001)))

        return arr1
