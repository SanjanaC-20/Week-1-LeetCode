class Solution {
    public int maxSubArray(int[] nums) {
        
            int maxsums = nums[0];
            int currentsums = nums[0];
            for (int i =1; i < nums.length; i++ ){
                currentsums = Math.max(nums[i],currentsums+nums[i]);
                maxsums = Math.max(maxsums,currentsums);

            }
        

      return maxsums;  
    }
}