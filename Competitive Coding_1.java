class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalsum = 0;

        for(int num : nums){
            totalsum += num;
        }
        
        long leftSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length-1 ; i++){
            leftSum += nums[i];
            long rightsum = totalsum - leftSum;

            if (leftSum >= rightsum){
                count++;
            }
        }
        return count;

        
    }
}