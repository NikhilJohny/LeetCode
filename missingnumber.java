// 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        for(int i = 1; i <= nums.length; i++){
            result = result + i;
            result = result - nums[i - 1];
        }
        return result;
    }
}