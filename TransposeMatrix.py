class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:

        row=len(matrix)
        col=len(matrix[0])

        newArray=Matrix = [[0 for x in range(row)] for y in range(col)]
        
        for i in range(col):
            for j in range(row):
               newArray[i][j]=matrix[j][i]
               

        return newArray
