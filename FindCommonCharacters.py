class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        map1={}
        for ch in words[0]:
           map1[ch]= map1.get(ch,0)+1

        for j in range(1,len(words)):
            map2={}
            for ch2 in words[j]:
                map2[ch2]=map2.get(ch2,0)+1
            toBeRemoved=[]
            for keys in map1:
                if map2.get(keys) is not None:
                    map1[keys]=min(map1[keys],map2[keys])
                else:
                    toBeRemoved.append(keys)

            for r in toBeRemoved:
                map1.pop(r)
            
        solList=[]

        for i in map1:
            for j in range(0,map1[i]):
                solList.append(i)

        return solList
