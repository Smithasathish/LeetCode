class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] asw = new int[n];
        for(int i=0; i< n; i++){
            asw[i] = nums[nums[i]];
        }
        return asw;
    }
}