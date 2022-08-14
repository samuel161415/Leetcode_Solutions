class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int source=image[sr][sc];
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        dfs(image,sr,sc,color,source,dir);
        
        return image; 
    }
    public void dfs(int[][]image,int row,int col,int newColor,int source,int[][] dir){
 
        image[row][col]=newColor;
        for(int[] i:dir){
           
            if(check(row+i[0],col+i[1],image,source)) 
               dfs(image,row+i[0],col+i[1],newColor,source,dir);
            else continue;;
        }
    }
      public boolean check(int row,int col,int[][]image,int source){
            if((0<=row&&row<image.length&&0<=col&&col<image[0].length)&&(image[row][col]==source)) 
                return true;
            return false;
        }
}