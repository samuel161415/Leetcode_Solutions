class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
            initial=len(t)
            tPointer=0
            for i in s:
                if tPointer==len(t):
                    return 0
                elif i==t[tPointer]:
                    tPointer+=1
                    initial-=1
            return initial
