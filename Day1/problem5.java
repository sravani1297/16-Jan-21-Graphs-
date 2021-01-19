/*
https://leetcode.com/problems/flood-fill/

**FLOOD FILL**

*/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int col=image[sr][sc];
        if(col!=newColor)
            dfs(image,sr,sc,col,newColor);
        return image;
    }
    public void dfs(int[][] image,int r,int c,int col,int newColor)
    {
        if (image[r][c]==col)
        {
            image[r][c]=newColor;
            if (r >= 1)
                dfs(image,r-1,c,col,newColor);
            if (c >= 1)
                dfs(image,r,c-1,col,newColor);
            if (r+1 < image.length)
                dfs(image,r+1,c,col,newColor);
            if (c+1 < image[0].length)
                dfs(image,r,c+1,col,newColor);
        }
    }
}