class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxValue = 0;
        for(int i=0; i<accounts.length; i++){
            int max =0;
            for(int j =0; j< accounts[i].length; j++){
                max = max+accounts[i][j];
            }
            maxValue = Math.max(maxValue,max);
        }
        return maxValue;
    }
}