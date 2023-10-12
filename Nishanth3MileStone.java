class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int reverse = image.length;
        for(int[]row:image ){
            for(int i = 0;i<(reverse+1)/2;i++){
                int tem = row[i];
                row[i] = row[reverse-1-i]^1;
                row[reverse-1-i] = tem^1;
            }
        }
        return image;
    }
}